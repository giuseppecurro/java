public class Test { 
 public static void main (String[] args) 
 { 
  Cricketer c1 = new Cricketer(); 
  Cricketer c2 = new Cricketer("sachin", "India", 32); 
  Cricketer c3 = new Cricketer(c2 ); 
  System.out.println(c2); 
  System.out.println(c3); 
  c1.name = "Virat"; 
  c1.team= "India"; 
  c1.age = 32; 
  System.out.println(c1); 
 } 
} 