//lancio di un dado
// 
import java.util.*;
public class Dado {
    
    int lancio() {
        int k = (int)(Math.random()*6+1);
        return k; 
    }
    
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        int x,y,contatore=0;
        do {
            x=d1.lancio();
            y=d2.lancio();
            contatore++;
        } while (x != y);
            
        System.out.println("n.lanci="+contatore+".\nContemporaneamente nei due dadi il: "+x+".");
    }
    
    
    
}
