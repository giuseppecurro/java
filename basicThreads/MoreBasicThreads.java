/*
You can easily add more threads to drive more tasks. Here, you can see how all the tasks run
in concert with one another:
*/ 
public class MoreBasicThreads {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
            System.out.println("Waiting for LiftOff");
    }
} 


/* Output: (Sample)
Waiting for LiftOff
#0(9), #1(9), #2(9), #3(9), #4(9), #0(8), #1(8),
#0(7), #1(7), #2(7), #3(7), #4(7), #0(6), #1(6),
#0(5), #1(5), #2(5), #3(5), #4(5), #0(4), #1(4),
#0(3), #1(3), #2(3), #3(3), #4(3), #0(2), #1(2),
#0(1), #1(1), #2(1), #3(1), #4(1), #0(Liftoff!),
#2(Liftoff!), #3(Liftoff!), #4(Liftoff!),
*/