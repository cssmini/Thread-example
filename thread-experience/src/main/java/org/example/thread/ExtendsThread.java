package org.example.thread;

/**
 * @author hxl
 * @date: 2020/4/15 11:59
 * @description: 以继承 Thread 的方式实现多线程
 */
public class ExtendsThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++){
            System.out.println(ExtendsThread.currentThread().getName()+" , i = "+i);
        }
    }
}
