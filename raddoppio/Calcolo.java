import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

class Calcolo implements ActionListener {
    JTextField   tf;
    JButton      b;
    Double       d;
    String       s;
    
    public Calcolo(JTextField tf1,  JButton b1) {
       tf=  tf1;
       b=   b1;
    }
    
    public void actionPerformed(ActionEvent e){
        
        String operazione = e.getActionCommand();
        
        if (operazione.equals("doppio")){
            d=(Double.parseDouble(tf.getText() )) *2.0;
            s=Double.toString(d);
            tf.setText(s);
        }

    }
}

