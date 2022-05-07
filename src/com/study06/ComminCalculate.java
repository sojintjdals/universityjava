package com.study06;

public class ComminCalculate {
    private int amount;
    private int interest;
    private Object interestLock = new Object();
    private Object amountLock = new Object();


    public ComminCalculate() {
        amount = 0;
    }

    public void addInterest(int value){
        synchronized (interestLock){
            interest+=value;
        }
    }

    public void plus(int value){
        synchronized (amountLock){
            amount+=value;
        }
    }
    public void minus(int value){
        amount-=value;
    }
    public int getAmount(){
        return amount;
    }
}
