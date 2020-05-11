package edu.seu.Dejavu.HTTPServer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 封装Request、Response
 */
public class Server3 {
    ServerSocket server;
    Socket client;

    public static void main(String[] args) {
        Server3 server=new Server3();
        server.start();
    }
    //启动方法
    public void start() {
        try {
            server=new ServerSocket(8888);
            receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //接收客户端
    private void receive() {
        try {
            client=server.accept();
            //接收客户端的请求信息
            Request request=new Request(client.getInputStream());
            Response res=new Response();
            res.prepareResponse(200);
            res.pushToClient(client);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //停止服务器
    public void stop() {
        try {
            client.close();
        } catch (IOException e) {

        }
    }
}

class Response {
    private StringBuilder responseContent=new StringBuilder();
    private static final String CRLF="\r\n";
    private int len=0;

    private void createHead(int status) {
        StringBuilder responseHead=new StringBuilder();
        //HTTP协议版本、状态码、描述
        responseHead.append("HTTP/1.1 ").append(status);
        switch (status) {
            case 200:
                responseHead.append(" OK");
                break;
            case 404:
                responseHead.append(" File not found");
                break;
            case 500:
                responseHead.append(" Internal error");
                break;
        }
        responseHead.append(CRLF);
        //响应头
        responseHead.append("Server:DIYSERVER Server/0.0.1").append(CRLF);
        responseHead.append("Date:").append(new Date(System.currentTimeMillis()).toString()).append(CRLF);
        responseHead.append("Content-type:text/html;charset=utf-8").append(CRLF);
        responseHead.append("Content-length:");
        responseContent.append(responseHead);
    }
    private void addContent(String content) {
        len+=(content+CRLF).getBytes().length;
        responseContent.append(len).append(CRLF).append(CRLF);
        responseContent.append(content).append(CRLF);
    }
    public void prepareResponse(int status) {
        createHead(status);
        addContent("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>This is a response page.</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Hello there.</p>\n" +
                "</body>\n" +
                "</html>");
    }
    public void pushToClient(Socket client) {
        //输出响应到流中
        try {
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(responseContent.toString());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Request {
    private static final String CRLF="\r\n";
    private String method;
    private String url;
    private Map<String, List<String>> parameter;
    private InputStream is;
    private String requestInfo;
    public Request() {
        method="";
        url="";
        parameter=new HashMap<>();
        requestInfo="";
    }

    public Request(InputStream is) {
        this();
        this.is = is;
        byte[] data=new byte[10240];
        try {
            int len=is.read(data);
            requestInfo=new String(data,0,len).trim();
        } catch (IOException e) {
        }
        parseRequest();
    }

    //分析请求信息，提取出对应的字符串
    private void parseRequest() {
        if (requestInfo == null || (requestInfo.trim().equals(""))) {
            return;
        }
        String firstLine=requestInfo.substring(0,requestInfo.indexOf(CRLF));
        method=firstLine.substring(0,firstLine.indexOf("/")).trim();
        String uriStr = firstLine.substring(firstLine.indexOf("/"), firstLine.indexOf("HTTP/"));
        String params="";
        if (method.equals("GET")) {
            String tmpURL=url= uriStr;
            if (tmpURL.contains("?")){
                String[] paramArray=tmpURL.split("\\?");
                url=paramArray[0];
                params=paramArray[1];
                //下面要将参数封装进Map中...
            }
        } else if (method.equals("POST")) {
            url= uriStr;
        }
    }
}