package com.study11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static java.io.File.separator;

public class FileServer {
    public static void main(String[] args) {
        FileServer sample = new FileServer();
        sample.startServer();
    }

    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            String fileName = "서버파일작성테스트";
            String filePath = "D:" + separator + "filetest" + separator + fileName + ".txt";
            while (true) {
                System.out.println("Server:Waiting for request.");
                client = server.accept();   // 접근
                System.out.println("-------------::: Accept :::-----------");
                System.out.println("Server:Accepted");
                InputStream stream = client.getInputStream();       // 앞으로 받을 데이타의 대한 파일 프라임
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));             // 읽어
                String data = in.readLine();
                System.out.println("data: " + data);
                String[] list = null;
                StringBuffer sb = new StringBuffer();
                sb.append(data);
                System.out.println(sb);
                if(data.toString().toLowerCase().equals("complete")){
                    System.out.println("완료");
                }
//                System.out.println("Received data:" + data);
//
//                OutputStream outStream = client.getOutputStream(); //보낼 스트림
//                BufferedWriter out = new BufferedWriter( new OutputStreamWriter( outStream ) );
//                byte[] bytes = data.getBytes();
//                StringBuffer sb = new StringBuffer();
//                sb.append(data);
//                if(data.toString().toLowerCase().equals("complete")){
//                    System.out.println("전송");
//                    String fileName = "서버파일작성테스트";
//                    String filePath = "D:" + separator + "filetest" + separator + fileName + ".txt";
//                    for (String write : sb){
//                        bufferedWriter.write(write);
//                        bufferedWriter.newLine();
//                    }
//
//                }
//                System.out.println("Return : "+sb.toString());
//                System.out.println("--------::: End :::---------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}