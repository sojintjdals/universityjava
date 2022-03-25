package com.study01;

import java.util.Scanner;

    public class gugudan {
        public static void main(String[] args) {
            // write your code here

            Scanner scanner = new Scanner(System.in);
            System.out.print("첫번째 숫자: ");
            int a = scanner.nextInt();
            scanner.close();


            for (int i = 1; i <= a; i++){
                System.out.println(i + "단");
                for (int j = 1; j <= 9; j++){
                    System.out.println(i + " * " + j + " = " + i * j) ;
                }
            }



        }
}
