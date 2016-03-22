import lib_pack_per_giochi.*;
public class Lancio_di_due_dadi {
 
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        int x,y,contatore=0;
        
        do {
            x=d1.lancio();
            y=d2.lancio();
            contatore++;
        } while (x != y);
            
        System.out.println("n.lanci:"+contatore+".\nContemporaneamente nei due dadi il numero "+x+".");
    }
}
