package org.example;

import org.example.thread.ExtendsThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread extendsThread = new ExtendsThread();
        Thread a=new Thread(extendsThread,"A");
        Thread b=new Thread(extendsThread,"B");
        Thread c=new Thread(extendsThread,"C");
        Thread d=new Thread(extendsThread,"D");
        Thread e=new Thread(extendsThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
