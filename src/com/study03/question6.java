package com.study03;

import java.util.Scanner;

public class question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단어나 문장을 입력하세요: ");
        String word = scanner.nextLine();
        scanner.close();
        System.out.println("길이: " + word.length());
        System.out.println("마지막글자: " + word.substring(word.length() - 1));
        System.out.println("첫글자: " + word.substring(0, 1));

    }

}
