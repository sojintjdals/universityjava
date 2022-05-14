package com.study07;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
    public static void main(String[] args) {
        FileManageClass sample = new FileManageClass();
        String pathName = "D:" + File.separator + "filetest";
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    private void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            getFileInfo(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) throws IOException{
        System.out.println("Absolute path = " + file.getAbsolutePath());
        System.out.println("Absolute file = " + file.getAbsoluteFile());
        System.out.println("Canonical path = " + file.getAbsolutePath());
        System.out.println("Canonical file = " + file.getAbsoluteFile());

        System.out.println("Name = " + file.getName());
        System.out.println("Path = " + file.getPath());
    }
}
