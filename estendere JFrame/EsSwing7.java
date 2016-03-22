//Il metodo pack() dimensiona il frame in modo
//da contenere esattamente il pannello dato
import java.awt.*; import javax.swing.*;
public class EsSwing7{
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 7");
        Container c = f.getContentPane();
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(300,400));
        p.setBackground(Color.GREEN);
        
        
        c.add(p);
        f.pack(); 
        f.show();
    }
}
    