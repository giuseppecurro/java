import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Es10Panel extends JPanel implements ActionListener {
        JButton b;
        JTextField txt1, txt2;
        
        public Es10Panel() {
            super();
            b = new JButton("Aggiorna");
            txt1 = new JTextField("Scrivere qui il testo",25);
            txt2 = new JTextField(25);
            txt2.setEditable(false);
            b.addActionListener(this);
            add(txt1);
            add(txt2);
            add(b);
    
        }
    
        public void actionPerformed(ActionEvent e) {
            txt2.setText(txt1.getText());
        }
        
        
        
        public static void main(String[] v){
            MyFrame f = new MyFrame("Esempio 10");
            Container c = f.getContentPane();
            Es10Panel p = new Es10Panel();
            c.add(p);
            //f.pack(); 
            f.setVisible(true);
        }
            
            
         
    }
