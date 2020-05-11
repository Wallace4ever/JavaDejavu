package edu.seu.Dejavu.HTTPServer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 接收请求并作出单次响应
 */
public class Server2 {
    ServerSocket server;
    Socket client;
    public static String CRLF="\r\n";

    public static void main(String[] args) {
        Server2 server=new Server2();
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
            byte[] data=new byte[10240];
            int len=client.getInputStream().read(data);
            String requestInfo=new String(data,0,len).trim();
            System.out.println(requestInfo);

            //发送响应
            StringBuilder responseContent=new StringBuilder();
            StringBuilder sb=new StringBuilder();
            responseContent.append("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "\t<title>This is a response page.</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<p>Hello there.</p>\n" +
                    "</body>\n" +
                    "</html>");
            //HTTP协议版本、状态码、描述
            sb.append("HTTP/1.1 200 OK").append(CRLF);
            //响应头
            sb.append("Server:DIYSERVER Server/0.0.1").append(CRLF);
            sb.append("Date:").append(new Date(System.currentTimeMillis()).toString()).append(CRLF);
            sb.append("Content-type:text/html;charset=utf-8").append(CRLF);
            sb.append("Content-length:").append(responseContent.toString().getBytes().length).append(CRLF);//正文长度
            //正文
            sb.append(CRLF);
            sb.append(responseContent).append(CRLF);
            //输出响应到流中
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(sb.toString());
            bw.flush();
            bw.close();
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
