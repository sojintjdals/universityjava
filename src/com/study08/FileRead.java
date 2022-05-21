package com.study08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.io.File.separator;

public class FileRead {
    public void fileRead(){
        String DATA_DIRECTORY = "D:" + separator + "filetest";
        File dir = new File(DATA_DIRECTORY); String[] filenames = dir.list();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            for (String filename : filenames) {
                System.out.println("filename : " + filename);
                fileReader = new FileReader(DATA_DIRECTORY + separator + filename);
                bufferedReader = new BufferedReader(fileReader);
                String data;
                while ((data = bufferedReader.readLine()) != null){
                    System.out.println("data:" + data);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if (fileReader!=null){
                try {
                    fileReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
