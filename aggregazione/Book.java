class Book 
{ 
 String name; 
 int price; 
 Author auth; 
 Book(String n,int p,Author at) 
 { 
  this.name=n; 
  this.price=p; 
  this.auth=at; 
 } 
 public void showDetail() 
 { 
  System.out.println("Book is"+name); 
  System.out.println("price "+price); 
  System.out.println("Author is "+auth.getAuthorName()); 
 } 
} 