import java.util.Vector;
public class Pila
{ 
    private Vector elementi;
    public Pila(){
        elementi = new Vector();
    }
    public void push (Object obj){
        elementi.addElement(obj);
    }
    public Object pop(){
        int s;
        Object obj = null;
        s = elementi.size();
        if (s>0){
            obj = elementi.elementAt(s-1);
            elementi.removeElementAt(s-1);
            
        }
        return obj;
    }
    public Object top(){
        int s;
        Object obj=null;
        s=elementi.size();
        if (s>0){
            obj=elementi.elementAt(s-1);}
         return obj;   
    }
    public boolean vuota(){
        if (elementi.size()==0)
            return true;
        else
            return false;
            
    }
}

