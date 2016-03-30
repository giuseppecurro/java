import java.util.Scanner;
public class Persona
{
    private String nome;
    private String cognome;
    private String codicef;
    private String indirizzo;
    
    public Persona(){}
    
    public void inserisci(){
    Scanner sc=new Scanner(System.in);
    nome=sc.nextLine();
    cognome=sc.nextLine();
    codicef=sc.nextLine();
    indirizzo=sc.nextLine(); 
    }
    
    public void stampa(){
    System.out.println("Nome: " +nome+", "+"Cognome: " +cognome+", "+"Codice Fiscale "+codicef+", "+"Indirizzo" +indirizzo);
    
    }
}
