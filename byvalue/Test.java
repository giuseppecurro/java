public class Test 
{ 
    public void callByValue(int x) 
    { 
        x=100; 
    } 
    public static void main(String[] args) 
    { 
       int x=50; 
        Test t = new Test(); 
        t.callByValue(x);  //function call 
        System.out.println(x); 
    } 
     
} 