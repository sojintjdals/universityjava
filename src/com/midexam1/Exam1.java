package com.midexam1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {
    static Scanner scanner = new Scanner(System.in);

    public static String inputText() {
        String a = "";
        String b = "";
        Map<String, Integer> map = new HashMap<>();
        System.out.println("문자를 입력해주세요: ");
        String words =scanner.nextLine();

        int i=0;
        int count =1;


        return "";
    }

    public static void main(String[] args) {
        System.out.println(inputText());
        scanner.close();
    }
}
