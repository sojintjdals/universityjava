package com.midexam2;

import java.util.Scanner;

public class FirstMeun{
    public void menu(){
        System.out.println("[메뉴 (삼성-갤럭시S22]");
    }

    public int fmenu(){
        System.out.println(" 1) 기기정보");
        System.out.println(" 2) 전원 ON");
        System.out.println(" 3) 전원 OFF");
        System.out.println(" 4) 빅스비");
        System.out.print("선택>");
        Scanner sc = new Scanner(System.in);
        int choice =sc.nextInt();
        return choice;
    }
}
