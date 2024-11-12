package com.java.ThreadTest;

class ProcessExample {
    public void startProcess() {
        try {
            Process process = new ProcessBuilder("notepad").start();
            System.out.println("Process started: Notepad");
        } catch (Exception e) {
            System.out.println("Error starting process: " + e.getMessage());
        }
    }
}

class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running, step: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {
        ProcessExample processExample = new ProcessExample();
        processExample.startProcess();
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();

        try {
            threadExample.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted while waiting for thread to finish");
        }

        System.out.println("ThreadEx complete");
    }
}

