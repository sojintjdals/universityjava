package com.study12;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
    static Scanner scanner;
    Socket socket = null;
    BufferedReader in = null;
    BufferedWriter out = null;
    OutputStream outputStream = null;
    InputStream inputStream = null;
    public static void main(String[] args) {
        FileClient sample = new FileClient();
        scanner = new Scanner(System.in);
        try {
            sample.sendSocketSample();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendSocketSample() throws IOException {
        String command = "";
        while(true){
            System.out.println("커맨드를 입력하세요");
            command = scanner.nextLine();
            sendSocketData(command);
            if(command.equals("EXIT")) {
                break;
            }
        }
        if(!command.equals("EXIT")) {
            outputStream.close();
            out.close();
            socket.close();
            inputStream.close();
            in.close();
        }
    }

    private void sendSocketData(String command) {

        try {
            System.out.println("Client:connecting");
            socket = new Socket("127.0.0.1", 9999);
            Thread.sleep(1000);             // 1sec 대기
            outputStream = socket.getOutputStream(); //보낼 스트림
            out = new BufferedWriter( new OutputStreamWriter( outputStream ) );
            out.write(command);
            out.newLine();
            out.flush();
            System.out.println("출력부분");

            inputStream = socket.getInputStream();       // 앞으로 받을 데이타의 대한 파일 프라임
            in = new BufferedReader(new InputStreamReader( inputStream) );
            String rec = in.readLine();
            System.out.println("recive Data : "+rec);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}