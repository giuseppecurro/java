//lancio di due oggetti "dado"
//ripetutamente finchè non escono facce uguali 
import java.util.*;
public class Dado {
    
    int lancio() {
        return (int)(Math.random()*6+1);
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
            
        System.out.println("n.lanci="+contatore+".\nContemporaneamente nei due dadi il "+x);
    }
}