//Inversione di una coda utilizzando una pila d'appoggio

//Date due code ordinate, fonderle in un'unica coda ordinata senza duplicarli
import java.util.Vector;
public class Coda
{
    private Vector elementi;
    
    public Coda(){
      elementi = new Vector();
    }
      public void add (Object obj){
        elementi.addElement(obj);
    }
    public Object remove(){
        Object obj = null;
        obj = elementi.elementAt(0); //elementAt restituisce il valore dell'elemento in quell'indice
        elementi.removeElementAt(0); 
        return obj;
    }
        public boolean vuota(){
        if (elementi.size()==0)
            return true;
        else
            return false;         
    }
    public int size(){return elementi.size();}
}
