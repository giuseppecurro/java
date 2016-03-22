package lib_pack_per_giochi;
import java.util.*;   //per avere la funzione random

public class Dado {
    
    public int lancio() {
        int k = (int)(Math.random()*6+1);
        return k; 
    }
}
