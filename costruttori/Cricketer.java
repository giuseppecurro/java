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
           
         //All Java objects have a toString() method, 
         //which is invoked when you try and print the object.
         //http://stackoverflow.com/questions/29140402/
         ///how-do-i-print-my-java-object-without-getting-sometype2f92e0f4
         
         public String toString()  
         { 
          return "this is " + name + " of "+team; //invokes myObject.toString() 
         } 
} 
 
