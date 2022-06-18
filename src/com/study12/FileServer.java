package com.study12;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.io.File.separator;

public class FileServer {
    public static void main(String[] args) {
        FileServer sample = new FileServer();
        sample.startServer();
    }

    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
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
                String[] array;
                String i = "";
                if(data.contains("+")){
                    array = data.split("\\+");
                    i = String.valueOf(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
                    System.out.println("i: " + i);
                }else if(data.contains("-")){
                    array = data.split("\\-");
                    i = String.valueOf(Integer.parseInt(array[0]) - Integer.parseInt(array[1]));
                    System.out.println("i: " + i);
                }else if(data.contains("*")){
                    array = data.split("\\*");
                    i = String.valueOf(Integer.parseInt(array[0]) * Integer.parseInt(array[1]));
                    System.out.println("i: " + i);
                }else if(data.contains("%")){
                    array = data.split("\\%");
                    i = String.valueOf(Integer.parseInt(array[0]) / Integer.parseInt(array[1]));
                    System.out.println("i: " + i);
                }else{
                    i = "Not Defined Command!!";
                    System.out.println("Not Defined Command!!");
                }
                System.out.println("파일작성");
                Date nowDate = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-HH:mm:ss");
                System.out.println(simpleDateFormat.format(nowDate));
                fileWriter = new FileWriter(filePath);
                bufferedWriter = new BufferedWriter(fileWriter);
                InetAddress local = InetAddress.getLocalHost();
                System.out.println("local: " + local);
                System.out.println(filePath);
                bufferedWriter.write(simpleDateFormat.format(nowDate) + " - "  + local + " : " + data + " -> " + i);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();

                OutputStream outStream = client.getOutputStream(); //보낼 스트림
                BufferedWriter out = new BufferedWriter( new OutputStreamWriter( outStream ) );
                out.write(i);
                out.newLine();
                out.flush();
                System.out.println("--------::: End :::---------");
                if(data.toString().toLowerCase().equals("exit")){
                    System.out.println("완료");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
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