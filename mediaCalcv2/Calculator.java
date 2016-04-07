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

                 int k; double max=0.0d,comodo;
                 Scanner s = new Scanner(display.getText());
                 String operazione = e.getActionCommand();
                 Object r = e.getSource();
                 String pre_str = "";           
                                 
              
               
                 if (((JRadioButton) e.getSource()).getText().equals("output del maggiore immesso")) { 
                        
                        if (((JRadioButton)r).isSelected() )
                            pre_str="*";
                        else pre_str=""; 
                        display.setText(pre_str);
                 } 
                 
                 if (operazione.equals("C")) { 
                     res = 0; 
                     display.setText("");
                     pre_str="";

                 } 
                 
                 if (operazione.equals("M")) {
                       k=0;                                  
                       while (s.hasNext()) {
                                 if (s.hasNextDouble()){
                                           comodo = s.nextDouble();
                                           res=res+comodo;
                                           if (comodo>max) { 
                                               max=comodo;
                                           }
                                           k++;}
                                 else s.next();          
                       }
                       
                       
                       if (pre_str.equals("*")){
                            pre_str="Max=";
                            pre_str.concat(Double.toString(max));
                       }
                       
                       display.setText(pre_str+"  n.val.:"+k+"  Media="+res/k);
                       s.close();
                 }
                 

            }       
}
            
        

