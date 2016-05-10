class ST_Employee { 
   
   int eid; 
   String name; 
   static String company_name; 
     
   static { 
    company_name ="StudyTonight";     //static block invoked before main() method  
   } 
 
   public void show()    { 
        System.out.println(eid+" "+name+" "+company_name); 
   } 
    
   public static void main( String[] args )  { 
     ST_Employee se1 = new ST_Employee(); 
     se1.eid = 104; 
     se1.name = "Abhijit"; 
     se1.show(); 
      
   } 
 
}