import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class EseguiCalcolo  { 
    
        
    public static void main(String[] v){
            
            JFrame f        = new JFrame("Calcolo del doppio");
            final JTextField tf   = new JTextField();           
            JButton b       = new JButton("doppio");
            JPanel p        = new JPanel();
            Container c     = f.getContentPane();
            
            tf.setColumns(10);
            p.add(tf);
            c.add(p);
            
            b.addActionListener(
                                new ActionListener() 
                                    {
                                        public void actionPerformed(ActionEvent e) {
                                                String operazione = e.getActionCommand();
                                                Double d;
                                                String s;
                                                if (operazione.equals("doppio")){
                                                    try {
                                                            d=(Double.parseDouble(tf.getText() )) *2.0;
                                                            s=Double.toString(d);}
                                                    catch  ( NumberFormatException no_double ) {
                                                           s="errore";
                                                    }    
                                                    tf.setText(s);
                                                }            
                                        }
                                    }
                                );
            p.add(b); 
                     
            f.setSize(639,199);
            f.setVisible(true);
    }
}
