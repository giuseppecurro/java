import java.util.Vector;
import java.util.Scanner;
public class Main
{   
    public static void main (String args[]){
           int n,i;
           Persona P = new Persona();
           Pila st= new Pila();
           Scanner sc = new Scanner(System.in);
           
           
           System.out.println("Quante persone vuoi gestire?");
           n=sc.nextInt();
          System.out.println("Inserisci nome, cognome, codice fiscale, indirizzo");
          for (i=0;i<n;i++){
              
              P.inserisci();
              st.push(P);
            }
            System.out.println("Adesso compare l'elenco per il ritiro dei questionari");
                
                     while (st.vuota()==false){
                     P = (Persona) st.pop();
                     P.stampa();
                    }
                    
                   
    }  
}
