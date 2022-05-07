package com.study06;

public class RunThreads {

    public static class RunnableSample implements Runnable{
        public void run(){
            System.out.println("This is RunnableSample's run() method.");
        }
    }

    public static class ThreadSample extends Thread{
        public void run(){
            System.out.println("This is RunnableSample's run() method.");
        }
    }

    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public void runBasic(){
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunThreads.runBasic() method is ended");
    }
}
