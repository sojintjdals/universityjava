package com.study02;

import java.util.Scanner;

public class question5 {
    static Scanner scanner = new Scanner(System.in);

    public static String inputText() {
        System.out.print("첫번째 문자를 입력해주세요: ");
        String firstText = scanner.nextLine();
        System.out.print("두번째 문자를 입력해주세요: ");
        String secondText = scanner.nextLine();
        return firstText + " " +secondText;
    }

    public static void main(String[] args) {
        System.out.println(inputText());
        scanner.close();
    }
}
