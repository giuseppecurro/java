import java.util.Scanner;
public class Compilatore
{
    public static void main (String args[]){
        int I=0;
        Pila p=new Pila();
        Scanner sc = new Scanner(System.in);
        String stringa,st2;
        System.out.println("Inserisci un'equazione: ");
        stringa=sc.nextLine();
        for (I=0;I<stringa.length();I++){
            if (stringa.charAt(I) == '(')
                p.push(stringa.charAt(I));
                if (stringa.charAt(I) == ')')
                    if (p.vuota()==false)
                        st2=(String) p.pop();
                    else
                        System.out.println("Errore");
         }
        
        
        
        
        
    }
}
