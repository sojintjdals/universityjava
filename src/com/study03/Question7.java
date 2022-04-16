package com.study03;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단어나 문장을 입력하세요: ");
        String word = scanner.nextLine();
        System.out.print("홀? 짝?: ");
        String type = scanner.nextLine();
        System.out.println(type);
        char[] array = word.toCharArray();
        scanner.close();

        if (type.equals("짝")){
           for (int i = 0; i < word.length(); i++){
                if(i % 2 != 0){
                    System.out.print(array[i] + " ");
                }
           }
        }
        if (type.equals("홀")){
            for (int i = 0; i < word.length(); i++){
                if(i % 2 == 0){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

}
