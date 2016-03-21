
import java.awt.*; import javax.swing.*;
public class EsSwing6{
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 6");
        Container c = f.getContentPane();
        JPanel p = new JPanel();
        JLabel lb1 = new JLabel("Etichetta");
        JLabel lb2 = new JLabel(new ImageIcon("./images/facebookIcon.jpg"));
        p.setPreferredSize(new Dimension(300,400));
        p.setBackground(Color.RED);
        p.add(lb1);
        p.add(lb2);
        c.add(p);
        f.pack(); 
        f.setVisible(true);
    }
}
    
