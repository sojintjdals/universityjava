package com.study10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            while (true){
                System.out.println("Server:Waiting for request");
                client = server.accept();
                System.out.println("Server:Accepted.");
                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(stream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                System.out.println("22222222222222222222222222");
                while ((data = in.readLine()) != null) {
                    receivedData.append(data);
                }


                System.out.println("Received data:[" + receivedData+"]");
                if (receivedData.toString().equals("exit")) {
                    String bye = "bye!";
                    byte[] bytes = bye.getBytes();
                    OutputStream out = client.getOutputStream();
                    BufferedOutputStream bufferOut = new BufferedOutputStream(out);
                    bufferOut.write(bytes);

                }else{
                    System.out.println("asdfasdf");
                }

                in.close();
                stream.close();
                client.close();

                System.out.println("----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server!=null){
                try {
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
