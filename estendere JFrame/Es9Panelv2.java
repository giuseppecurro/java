import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Es9Panelv2 extends JPanel {
    JButton b1, b2;
    
    public Es9Panelv2()    {
        super();
        b1 = new JButton("Rosso");
        b2 = new JButton("Azzurro");
        b1.addActionListener(new Es9Listener(this,Color.red));
        b2.addActionListener(new Es9Listener(this,Color.cyan));
        add(b1);
        add(b2);
    }
        
    class Es9Listener implements ActionListener {
        private JPanel pannello;
        private Color colore;
        
        public Es9Listener(JPanel p, Color c){
            pannello = p; colore = c;
        }
        
        public void actionPerformed(ActionEvent e){
            pannello.setBackground(colore);
        }
    }
        
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 9");
        Container c = f.getContentPane();
        Es9Panelv2 p = new Es9Panelv2();
        c.add(p);
        //f.pack(); 
        f.setVisible(true);
    }

}
    