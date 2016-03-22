//bluej-linux-pag.262 java cookbook
import java.io.*;
import java.util.*;
//
public class ScannerTest {
public static void main(String [ ] args)
{
  String sampleDate = "25 Dec 1988 -12,5";
  Scanner sDate = new Scanner(sampleDate);
  
  int dom =     sDate.nextInt( );
  String mon =  sDate.next( );
  int year =    sDate.nextInt( );
  float t =     sDate.nextFloat( );
  
  System.out.println(dom+"\t"+
                     mon+"\t"+
                     year+"\t"+
                     t);
}
}

