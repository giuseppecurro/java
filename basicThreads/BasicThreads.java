/*
The traditional way to turn a Runnable object into a working task is to hand it to a Thread
constructor. This example shows how to drive a Liftoff object using a Thread-
The most basic use of the Thread class.
*/
public class BasicThreads {
    public static void main(String[] args) {
            Thread t = new Thread(new LiftOff());
            t.start();
            System.out.println("Waiting for LiftOff");
    }
} 
