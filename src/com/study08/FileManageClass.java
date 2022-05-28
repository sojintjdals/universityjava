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
            FileWrite write = new FileWrite();
            FileRead read = new FileRead();
            FileDelete del = new FileDelete();
            file.menu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("선택: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")){
                System.out.println("[메모 쓰기]");
                write.fileWrite();
            }else if (choice.equals("2")){
                System.out.println("[메모 읽기]");
                read.fileRead();
            }else if (choice.equals("3")){
                System.out.println("[메모 삭제]");
                del.fileDelete();
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

}
