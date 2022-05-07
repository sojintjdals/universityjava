package com.study05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Sample_2_1 {

    public static void main(String[] args) {
        Sample_2_1 print = new Sample_2_1();
        ArrayList grade = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println(i + 1 + "번째 성적을 입력해주세요: ");
            int inputNum = scanner.nextInt();
            grade.add(inputNum);
        }
        System.out.println("arraylist: " + grade);

        grade.set(0, 0);
        grade.set(2, 0);
        grade.set(4, 0);

        System.out.println("arraylist: " + grade);

        LinkedList<Integer> grade2 = new LinkedList<Integer>();
        grade2.add(80);
        grade2.add(86);
        grade2.add(100);
        grade2.add(60);
        grade2.add(71);
        grade2.add(75);

        System.out.println("linkedlist: " + grade2);

        grade2.set(0, 0);
        grade2.set(2, 0);
        grade2.set(4, 0);

        System.out.println("linkedlist: " + grade2);
    }

}
