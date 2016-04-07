//La classe Calculator è sensibile all'azione sui tasti 
//ed include le operazioni conseguenti:
//1)Fa processare alla Scanner quanto prelevato da Jtextfield
//2)Nel caso del pulsante "M" pigiato recupera dalla stringa i double validi ed effettua i calcoli
//  per poi visualizzarli.
//3)Nel caso del pulsante "C" viene effettuato un reset.
//4)Nel caso di settaggio del radio button viene fornita in output  l'informazione aggiuntiva del valore più alto
//immesso.

import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

class Calculator implements ActionListener {
            private  double  res = 0; 
            private  JTextField display;
            private  JRadioButton radio;
            private  JButton b;
                            
            public Calculator(JTextField t, JRadioButton r) {          
                display = t;
                radio = r;
            }
                                 
            
            public void actionPerformed(ActionEvent e){

                 int k; double max=Double.MIN_VALUE,comodo;
                 Scanner s = new Scanner(display.getText());
                 String pre_str = "";           
             
                 String operazione = e.getActionCommand();
                  
                 if (operazione.equals("output del maggiore immesso"));{
                        if (radio.isSelected()) 
                             pre_str="*";
                        else pre_str=""; 
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
                                       k++;
                             }
                             else s.next();          
                       }
                       
                       
                       if (pre_str.equals("*")){
                            pre_str="Max="+Double.toString(max);
                       }
                       String nuovo_formato=String.format("%.2f",res/k);
                       display.setText(pre_str+"  #"+k+"  Media="+nuovo_formato);
                       s.close();
                 }
                 

            }       
}
            
        

