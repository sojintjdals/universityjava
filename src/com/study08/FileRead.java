package com.study08;

import com.study07.FileManageClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.io.File.separator;

public class FileRead {
    public void fileRead(){
        String DATA_DIRECTORY = "D:" + separator + "filetest";
        File dir = new File(DATA_DIRECTORY); String[] filenames = dir.list();
        FileReadDetail fileDetail = new FileReadDetail();
        Scanner scanner = new Scanner(System.in);
        FileManageClass menu = new FileManageClass();
        try {
            int count = 1;
            System.out.println("[번호]         [파일명]           [파일내용]");
            for (String filename : filenames) {
                FileReader fileReader = new FileReader(DATA_DIRECTORY + separator + filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                bufferedReader.readLine();
                System.out.println("  " + count + "           " + filename +
                        "          " + bufferedReader.readLine() + "......");
                count++;
            }
            System.out.println("0: 목록끝내기");
            System.out.print("메모장 상세보기 선택(번호):");
            int fileNum = scanner.nextInt();
            if (fileNum != 0){
                String fileName = filenames[fileNum-1];
                System.out.println("fileName: " + fileName);
                fileDetail.fileReadDetail(fileName);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
