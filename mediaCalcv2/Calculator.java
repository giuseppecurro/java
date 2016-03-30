//La classe Calculator è sensibile all'azione sui tasti 
//ed include le operazioni conseguenti:
//1)Fa processare alla Scanner quanto prelevato da Jtextfield
//2)Nel caso del pulsante "M" pigiato recupera dalla stringa i double validi ed effettua i calcoli
//  per poi visualizzarli.
//3)Nel caso del pulsante "C" viene effettuato un reset.

import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

class Calculator implements ActionListener {
            double res = 0; 
            JTextField display;
                            
            public Calculator(JTextField t) {
                display = t;                   
            }
            
            public void actionPerformed(ActionEvent e){

                 int k; 
                 Scanner s = new Scanner(display.getText());
                 String operazione = e.getActionCommand();
                 
                 if (operazione.equals("C")) { 
                     res = 0; 
                     display.setText("");

                 } 
                 
                 if (operazione.equals("M")) {
                       k=0;                                  
                       while (s.hasNext()) {
                                 if (s.hasNextDouble()){
                                           res += s.nextDouble();
                                           k++;}
                                 else s.next();          
                       }
                       display.setText("n.valori:"+k+"  Media="+res/k);
                       s.close();
                 }
            }       
}
            
        

