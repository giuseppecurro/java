/*
In the following example, the task’s run( ) is not driven by a separate thread; it is simply
called directly in main( ) (actually, this is using a thread: the one that is always allocated for
main( )):802 Thinking in Java
*/

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}