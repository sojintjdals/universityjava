package com.study11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static java.io.File.separator;

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
        while(true){
            System.out.println("문자를 입력하세요");
            String request = scanner.nextLine();
            sendSocketData(request);
            if(request.equals("complete")) {
//                String filePath = "D:" + separator + "filetest" + separator + fileName + ".txt";
                break;
            }
        }
        inputStream.close();
        outputStream.close();
        out.close();
        in.close();
        socket.close();

    }

    private void sendSocketData(String data) {

        try {
            System.out.println("Client:connecting");
            socket = new Socket("127.0.0.1", 9999);
            Thread.sleep(1000);             // 1sec 대기
            outputStream = socket.getOutputStream(); //보낼 스트림
            out = new BufferedWriter( new OutputStreamWriter( outputStream ) );
            out.write(data);
            out.newLine();
            out.flush();

//            inputStream = socket.getInputStream();       // 앞으로 받을 데이타의 대한 파일 프라임
//            in = new BufferedReader(new InputStreamReader( inputStream) );
//            String recv = in.readLine();
//            System.out.println("recive Data : "+recv);

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