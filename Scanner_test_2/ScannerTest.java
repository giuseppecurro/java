//prove della classe Scanner 5/2/2015
import java.io.*;
import java.util.*;
//
public class ScannerTest {
    public static void main(String [ ] args){
        float[] VETT= new float [11];
        int i;
        String sampleDate;
        System.out.println("Immetti: nome provincia eta voti:");
        Scanner sDate = new Scanner(System.in);
        
        String nome = sDate.next();
        String Prov = sDate.next();
        int age =    sDate.nextInt( );
        for (i=1;i<11;i++){
                VETT[i]=sDate.nextInt( );
        }
 
        System.out.println(nome+"\t"+Prov+"\t"+age);
        
        for (i=1;i<11;i++){
            System.out.println(VETT[i]);
        }
    }
}
//////////////////////////////////////////////////
