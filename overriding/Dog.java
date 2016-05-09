class Animal { 
 public void eat() 
 { 
     System.out.println("Generic Animal eating"); 
 } 
} 
 

public class Dog extends Animal { 
 public void eat()   //eat() method overriden by Dog class. 
 { 
  System.out.println("Dog eat meat"); 
 } 

 
 public static void main(String[] args) { 
      Animal a = new Animal(); 
      Dog d = new Dog();
      a.eat();
      d.eat(); 
 } 


} 