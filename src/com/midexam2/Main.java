package com.midexam2;


public class Main{
    public static void main(String[] args) {
        boolean power = true;
        while (true){


            Device d = new Device();
            d.menu();
            int a = d.fmenu();
            if(a == 1 && power){
                int b = d.sMenu();
                if(b == 1){
                    d.deviceInfo();
                }else if (b == 2){
                    d.deviceChange();
                }
            }else if(a == 2){
                power = d.powerOn();
            }else if(a == 3){
                power = d.powerOff();
            }else if(a == 4 && power){
                d.bixby();
            }else{
                System.out.println("전원이 꺼져있습니다.");
            }
        }
    }
}
