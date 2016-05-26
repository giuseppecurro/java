/*
We can use an Executor instead of explicitly creating Thread objects in
MoreBasicThreads.java. A LiftOff object knows how to run a specific task; like the
Command design pattern, it exposes a single method to be executed. An ExecutorService
(an Executor with a service lifecycle—e.g., shutdown) knows how to build the appropriate
context to execute Runnable objects. In the following example, the CachedThreadPool
creates one thread per task. Note that an ExecutorService object is created using a static
Executors method which determines the kind of Executor it will be:
*/

import java.util.concurrent.*;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++)
                exec.execute(new LiftOff());
        exec.shutdown();
    }
} 

