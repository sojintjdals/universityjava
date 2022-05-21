package com.study08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.io.File.separator;

public class FileWrite {
    public void fileWrite(){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("이름: ");
            String fileName = scanner.nextLine();
            String filePath = "D:" + separator + "filetest" + separator + fileName + ".txt";
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println(filePath);
            System.out.print("중요도(A, B, C): ");
            String importance = scanner.nextLine();
            bufferedWriter.write(importance);
            bufferedWriter.newLine();
            System.out.println(importance);
            System.out.print("내용(exit:입력종료): ");
            while (true){
                String write = scanner.nextLine();
                if (write.equals("exit")){
                    break;
                }
                bufferedWriter.write(write);
                bufferedWriter.newLine();
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
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

        }
    }
}
