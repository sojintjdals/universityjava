package com.study06;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }
    public void runCommonCalculate() {
        ComminCalculate calc = new ComminCalculate();
        ComminCalculate calc1 = new ComminCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc1,true);

        ComminCalculate calc2 = new ComminCalculate();
        ModifyAmountThread thread2 = new ModifyAmountThread(calc2,true);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());
            System.out.println("Final value is " + calc1.getAmount());
            System.out.println("Final value is " + calc2.getAmount());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
