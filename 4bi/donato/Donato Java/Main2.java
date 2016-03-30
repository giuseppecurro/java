import java.util.Vector;
import java.util.Scanner;
public class Main2
{   
    public static void main (String args[]){
           int n,i;
           Persona P;
           Pila st= new Pila();
           Pila com = new Pila();
           
           Scanner sc = new Scanner(System.in);
           
           
           System.out.println("Quante persone vuoi gestire?");
           n=sc.nextInt();
          System.out.println("Inserisci nome, cognome, codice fiscale, indirizzo");
          for (i=0;i<n;i++){
             P = new Persona();
              P.inserisci();
              st.push(P);
            }
          
          System.out.println("Adesso compare l'elenco al contrario");
                 for (i=n-1;i>=0;i--){
                      P = new Persona();
                     com.push(P);
                     P.stampa();
                    }
    }  
}

