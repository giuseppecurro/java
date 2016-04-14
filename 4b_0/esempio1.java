import java.awt.*;
import javax.swing.*;
public class esempio1{
        public static void main(String[] v){
            JFrame f = new JFrame("Esempio 1");
            f.setBounds(200,100,600,300);
            Container c = f.getContentPane();
            JPanel p = new JPanel();
            JLabel lb1 = new JLabel("Etichetta");
           JButton b = new JButton("conferma");
           JRadioButton jr = new JRadioButton("false");
           JTextField txt = new JTextField("input dati");


           c.add(p);
           p.add(lb1);
           p.add(b);
           p.add(jr);
           p.add(txt);






            f.show();
        }

}
