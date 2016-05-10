class Cricketer { 
         String name; 
         String team; 
         int age; 
         
         Cricketer ()    //default constructor . 
         { 
          name =""; 
          team =""; 
          age = 0; 
         } 
         
         Cricketer(String n, String t, int a)    //constructor overloaded  
         { 
          name = n; 
          team = t; 
          age = a; 
         } 
         
         Cricketer (Cricketer ckt)      //constructor similar to copy constructor of c++   
         { 
          name = ckt.name; 
          team = ckt.team; 
          age = ckt.age; 
         } 
         
         public String toString()  
         { 
          return "this is " + name + " of "+team; 
         } 
} 
 
