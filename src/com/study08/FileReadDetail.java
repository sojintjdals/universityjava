package com.study08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.io.File.separator;

public class FileReadDetail {
    public void fileReadDetail(String fileName){
        String DATA_DIRECTORY = "D:" + separator + "filetest";

        try {
            FileReader fileReader = new FileReader(DATA_DIRECTORY + separator + fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            System.out.println("중요도:" + bufferedReader.readLine());
            System.out.print("내용: ");

            while ((data = bufferedReader.readLine()) != null){
                    System.out.println(data);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
