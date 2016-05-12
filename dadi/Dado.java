//lancio di due oggetti della classe "Dado"
//ripetutamente finchè non escono facce uguali
//preferito fare statico il metodo lancio
//evitando una duplicazione in memoria per ogni oggetto
//sarebbe stato poss. usarlo: "Dado.lancio()"
import java.util.*;
public class Dado {
    
    final static int lancio() {
        return (int)(Math.random()*6+1);
    }
        
    public static void main(String[] args) {
        Dado d1,d2 = new Dado();
        int x,y,contatore=0;
        do {
            x=lancio();
            y=lancio();
            contatore++;
        } while (x != y);
            
        System.out.println("n.lanci="+contatore+".\nContemporaneamente nei due dadi il "+x);
    }
}