package com.study01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자: ");
        int a = scanner.nextInt();
        System.out.println("두번째 숫자: ");
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        scanner.close();
    }
}
