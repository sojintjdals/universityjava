package com.midexam2;

import java.util.Scanner;

public class SecondMenu extends FirstMeun{
    public int sMenu(){
        menu();
        System.out.println(" 1) 기기정보");
        System.out.println(" 2) 기기변경");
        System.out.print("선택>");
        Scanner sc = new Scanner(System.in);
        int choice =sc.nextInt();
        return choice;
    }

    public boolean powerOn(){
        System.out.println("핸드폰 전원이 켜졌습니다.");
        return true;
    }

    public boolean powerOff(){
        System.out.println("핸드폰 전원이 꺼졌습니다");
        return false;
    }

    public void bixby(){
        Scanner sc = new Scanner(System.in);
        menu();
        System.out.println(" 1) 검색");
        System.out.print("선택>");
        int choice =sc.nextInt();

        if (choice == 1){
            while (true){
                System.out.print("검색단어>");
                String words =sc.nextLine();
                System.out.print("결과=> " +  words + "은 " + words.length() + "글자 입니다.");
                System.out.print("검색을 더 하시겠습니까? (yes OR no)?");
                String search =sc.nextLine();
                if(search.equals("no")){
                    break;
                }
            }
        }
    }
}
