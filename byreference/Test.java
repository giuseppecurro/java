public class Test 
{ 
    int x=10; 
    int y=20; 
    public void callByReference(Test t) 
    { 
        t.x=100; 
        t.y=50; 
    } 
    public static void main(String[] args) 
    { 
        
        Test ts = new Test(); 
        System.out.println("Before "+ts.x+" "+ts.y); 
        ts.callByReference(ts); 
        System.out.println("After "+ts.x+" "+ts.y); 
    } 
     
}