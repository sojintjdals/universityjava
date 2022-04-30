package com.midexam2;

import java.util.Scanner;

public class Device extends SecondMenu{
    public void deviceInfo(){
        System.out.println(":::::: 삼성 갤럭시 S22 ::::::");
        System.out.println("제조사 : 삼성전자");
        System.out.println("모델명 : 갤럭시 S22");
        System.out.println("가격 : 100만원");
    }

    public void deviceChange(){
        menu();
        System.out.println(" 1) 애플");
        System.out.println(" 2) 삼성");
        System.out.println(" 2) 샤오미");
        System.out.print("선택>");
        Scanner sc = new Scanner(System.in);
        int choice =sc.nextInt();

        if(choice == 1){
            System.out.println("애플 아이폰이 선택 되었습니다.");
        }else if(choice == 2){
            System.out.println("삼성 갤럭시가 선택 되었습니다.");
        }else if(choice == 3){
            System.out.println("샤오미 레드미 노트가 선택 되었습니다.");
        }
    }

}
