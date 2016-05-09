class Animal { 
 public void eat() 
 { 
     System.out.println("Generic Animal eating"); 
 } 
} 
 
class Dog extends Animal { 
 public void eat()   //eat() method overriden by Dog class. 
 { 
  System.out.println("Dog eat meat"); 
 } 
} 