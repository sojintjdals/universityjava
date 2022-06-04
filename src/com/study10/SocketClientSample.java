package com.study10;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    public void sendSocketSample() {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        while (true){
            System.out.print("연결: ");
            word = scanner.nextLine();
            sendSocketData(word);
        }
    }

    public void sendSocketData(String data) {
        Socket socket = null;
        try {
            System.out.println("Client:Connecting");
            socket = new Socket("127.0.0.1", 9999);
            System.out.println("Client:Connect status=" + socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out =
                    new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client:Sent data");

            InputStream inputStream = socket.getInputStream();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(inputStream));
            String bye = null;
            StringBuilder receivedData = new StringBuilder();
            while ((bye = in.readLine()) != null) {
                receivedData.append(bye);
            }
            System.out.println(receivedData.toString());

            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null){
                try {
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
