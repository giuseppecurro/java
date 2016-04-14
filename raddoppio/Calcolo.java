import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

class Calcolo implements ActionListener {
    JTextField   tf;
    JButton      b;
    Double       d;
    String       s;
    
    public Calcolo(JTextField tf,  JButton b) {
       this.tf=  tf;
       this.b=   b;
    }
    
    public void actionPerformed(ActionEvent e){
        
        String operazione = e.getActionCommand();
        
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

