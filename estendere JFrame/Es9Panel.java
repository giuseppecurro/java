import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Es9Panel extends JPanel implements ActionListener {
    JButton b1, b2;
    public Es9Panel()    {
        super();
        b1 = new JButton("Rosso");
        b2 = new JButton("Azzurro");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object pulsantePremuto = e.getSource();
        if (pulsantePremuto==b1)
            setBackground(Color.red);
        if (pulsantePremuto==b2)
            setBackground(Color.cyan);
    }
    
        
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 9");
        Container c = f.getContentPane();
        Es9Panel p = new Es9Panel();
        c.add(p);
        //f.pack(); 
        f.setVisible(true);
    }

}
    