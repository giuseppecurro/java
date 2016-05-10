/*
 * Aggregation (HAS-A)
HAS­A relationship is based on usage, rather than inheritance. 
In other words, class A has­a relationship with class B, if code in class A has a
reference to an instance of class B.
Q. What is Composition in java?
Composition is restricted form of Aggregation. 
For example a class Car cannot exist without Engine.
 */

class Test { 
 public static void main(String args[])  { 
      Author ath=new Author("Me",22,"India"); 
      Book b=new Book("Java",550,ath); 
      b.showDetail(); 
 } 
}