package com.study02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class question4 {

    static Scanner scanner = new Scanner(System.in);

    public static int setSize() {
        System.out.print("입력할 숫자의 개수를 입력해주세요: ");
        int numSize = scanner.nextInt();
        return numSize;
    }

    public static int[] inputNum(int numSize, int[] numList) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numSize; i++){
            System.out.print("숫자를 입력해주세요: ");
            num = scanner.nextInt();
            numList[i] = num;
        }
        return numList;
    }

    public static void main(String[] args) {
        int numSize = setSize();
        int[] numList = new int[numSize];
        int[] numList2 = inputNum(numSize, numList);
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        int even = 0, odd = 0;
        scanner.close();

        System.out.println("size: "+ numList2.length);
        for (int i = 0; i < numList2.length; i++){
            System.out.println("num: " + numList2[i]);
            if(numList2[i] % 2 == 0){
                System.out.println("짝수");
                evenList.add(numList2[i]);
            }else {
                System.out.println("홀수");
                oddList.add(numList2[i]);
            }
        }

        System.out.println("홀수: " + oddList);
        System.out.println("짝수: " + evenList);
    }


}
