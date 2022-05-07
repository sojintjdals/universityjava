package com.study06;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads sample = new RunMultiThreads();
        sample.runMultiThread();
    }

    public void runMultiThread(){
        RunThreads.RunnableSample[] runnable = new RunThreads.RunnableSample[5];
        RunThreads.ThreadSample[] thread = new RunThreads.ThreadSample[5];
        for (int loop = 0; loop < 5; loop++){
            runnable[loop] = new RunThreads.RunnableSample();
            thread[loop] = new RunThreads.ThreadSample();

            new Thread(runnable[loop]).start();
            thread[loop].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended");
    }
}
