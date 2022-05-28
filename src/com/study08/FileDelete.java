package com.study08;

import com.study07.FileManageClass;

import java.io.*;
import java.util.Scanner;

import static java.io.File.separator;

public class FileDelete {
    public void fileDelete(){
        String DATA_DIRECTORY = "D:" + separator + "filetest";
        File dir = new File(DATA_DIRECTORY); String[] filenames = dir.list();
        Scanner scanner = new Scanner(System.in);
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
                fileReader.close();
            }
            System.out.println("0: 삭제취소");
            System.out.print("파일 삭제(번호):");
            int fileNum = scanner.nextInt();
            if (fileNum != 0){
                String fileName = filenames[fileNum-1];
                System.out.println("file: " + DATA_DIRECTORY + separator + fileName);
                File file = new File(DATA_DIRECTORY + separator + fileName);
                file.delete();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
