package edu.seu;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MiniCurl {
    public static InetAddress ina;
    public static void work(String args){
        try{
            ina=InetAddress.getByName(args);
        }catch (UnknownHostException e){
            System.out.println("Unknown Host!\n");
            System.exit(0);
        }

        try{
            Socket so=new Socket(ina,80);
            OutputStream os=so.getOutputStream();
            String method="GET / HTTP/2.0\n\n";
            os.write(method.getBytes());
            InputStream is=so.getInputStream();
            Scanner s=new Scanner(is);
            while (s.hasNextLine()){
                String line=s.nextLine();
                System.out.println(line);
            }
            so.close();
        }catch (IOException e){e.printStackTrace();}
    }
}
