import java.awt.*; 
import javax.swing.*;

public class EseguiCalcolo {               
           
    public static void main(String[] v){
            Calcolo k;
            JFrame f        = new JFrame("Calcolo del doppio");
            JTextField tf   = new JTextField();           
            JButton b       = new JButton("doppio");
            JPanel p        = new JPanel();
            Container c     = f.getContentPane();
            
            tf.setColumns(10);
            p.add(tf);
            c.add(p);
            p.add(b);
            
            k= new Calcolo(tf,b);
            b.addActionListener(k);
           
            f.setSize(639,199);
            f.setVisible(true);
    }
}
