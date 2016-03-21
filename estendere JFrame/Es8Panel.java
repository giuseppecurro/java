//per fungere da ascoltatore
//degli eventi di azione, deve
//implementare l'interfaccia
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Es8Panel extends JPanel implements ActionListener{
//Per fungere da ascoltatore degli eventi di azione,deve implementare l'interfaccia.
    private JLabel l;
    
    Es8Panel() {
        super();
        l = new JLabel("Tizio");
        add(l);
        JButton b = new JButton("Tizio/Caio");
        b.addActionListener(this); //Registra se stesso (this) come ascoltatore degli
                                   //eventi generati dal pulsante b
        add(b);
    }

   public void actionPerformed(ActionEvent e) {
        if (l.getText().equals("Tizio"))
            l.setText("Caio");
        else
            l.setText("Tizio");
    }
    

    
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 8");
        Container c = f.getContentPane();
        Es8Panel p = new Es8Panel();
        c.add(p);
        f.pack(); 
        f.setVisible(true);
    }

}

    
