package com.study07;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "D:\\filetest";
        // String pathName = "/filetest";
        sample.checkPath(pathName);
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }
}
