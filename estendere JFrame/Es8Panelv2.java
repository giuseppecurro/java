
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Es8Panelv2 extends JPanel {

    private JLabel l;
    
    Es8Panelv2() {
        super();
        l = new JLabel("Tizio");
        add(l);
        JButton b = new JButton("Tizio/Caio");
        b.addActionListener(new Es8Listener(l)); 
        add(b);
    }

   
    
    class Es8Listener implements ActionListener {
               
        public Es8Listener(JLabel label)  { 
            l=label;
        }
        
        public void actionPerformed(ActionEvent e) {
            if (l.getText().equals("Tizio"))
            l.setText("Caio");
            else l.setText("Tizio");
        }      
       
    }    
        
    
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 8");
        Container c = f.getContentPane();
        Es8Panelv2 p = new Es8Panelv2();
        c.add(p);
        f.pack(); 
        f.setVisible(true);
    }

}
  