package com.study08;

import com.study07.ManageTextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.io.File.separator;

public class FileManageClass {
    public static void main(String[] args) {
        while (true){
            FileManageClass file = new FileManageClass();
            file.menu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("선택: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")){
                System.out.println("[메모 쓰기]");
                file.fileWrite();
            }else if (choice.equals("2")){
                System.out.println("[메모 읽기]");
            }else if (choice.equals("3")){
                System.out.println("[메모 삭제]");
            }else if (choice.equals("4")){
                System.out.println("[종료]");
                break;
            }
        }

    }

    public void menu(){
        System.out.println("    [메모장]");
        System.out.println("=====================================");
        System.out.println("        1.메모 쓰기");
        System.out.println("        2.메모 읽기");
        System.out.println("        3.메모 삭제");
        System.out.println("        4.종료");
        System.out.println("=====================================");
    }

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
