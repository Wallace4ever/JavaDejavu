package edu.seu.Dejavu.HTTPServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接收http请求
 */
public class Server {
    ServerSocket server;

    public static void main(String[] args) {
        Server server=new Server();
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
            Socket client=server.accept();
            //接收客户端的请求信息
            String msg=null;
            StringBuilder sb=new StringBuilder();
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            while ((msg = br.readLine()).length() > 0) {
                sb.append(msg);
                sb.append("\r\n");
                if (msg==null)
                    break;
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //停止服务器
    public void stop() {

    }
}
