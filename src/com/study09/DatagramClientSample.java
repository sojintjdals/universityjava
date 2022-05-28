package com.study09;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class DatagramClientSample {
    public static void main(String[] args) {
        DatagramClientSample sample = new DatagramClientSample();
        sample.sendDatagramSample();
    }

    public void sendDatagramSample() {
        for (int loop = 0; loop < 3; loop++){
            sendDatagramData("I liked UDP " + new Date());
        }
        sendDatagramData("EXIT");
    }

    public void sendDatagramData(String data) {
        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            byte[] buffer = data.getBytes();
            DatagramPacket packet
                    = new DatagramPacket(buffer, 0, buffer.length, address, 9999);
            System.out.println("Client:Sent data");
            client.close();
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

}
