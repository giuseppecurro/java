//La classe Calculator è sensibile all'azione sui tasti 
//ed include le operazioni conseguenti:
//1)Fa processare alla Scanner quanto prelevato da Jtextfield
//2)Nel caso del pulsante "M" pigiato recupera dalla stringa i double validi ed effettua i calcoli
//  per poi visualizzarli.
//3)Nel caso del pulsante "C" viene effettuato un sommatoriaet.
//4)Nel caso di settaggio del radio button viene fornita in output  l'informazione aggiuntiva del valore più alto
//immesso.

import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

class Calculator implements ActionListener {
            Campo_input rigo;
            Help help;
            JRadioButton radio;
            String text0 = "\n\nSeparare i dati immessi\ncon lo SPAZIO.\n\nUsare la VIRGOLA \ncon i decimali.\n"; 
  
            public Calculator(Campo_input t, JRadioButton r, Help h) {                     
                    rigo = t;
                    radio = r;
                    help = h; 
            }                    
            
            public void actionPerformed(ActionEvent e){

                 int quanti,n; 
                 double max=Double.MIN_VALUE,comodo,sommatoria=0.0d;

                 Scanner  s = new Scanner(rigo.getText());
                 String mess1 = "";   
                 help.setText(text0);
             
                 String operazione = e.getActionCommand();
                  
                 if (operazione.equals("output del maggiore immesso"));{
                        if (radio.isSelected()) 
                             mess1="*";
                        else mess1=""; 
                 } 
                 
                 if (operazione.equals("C")) { 
                     help.setBackground(Color.yellow);
                     sommatoria = 0;                
                     help.setText(text0);
                     rigo.setText("");
                     mess1="";
                 } 
                 
                 if (operazione.equals("M")) {
                       quanti=0; n=0;                                 
                       while (s.hasNext()) {
                             if (s.hasNextDouble()){
                                       comodo = s.nextDouble();
                                       sommatoria=sommatoria+comodo;
                                       if (comodo>max) { 
                                           max=comodo;
                                       }
                                       quanti++;n++;
                             }
                             else {
                                 s.next();
                                 n++;
                             }    
                       }
                       
                       if (n>quanti) {help.accoda("\n\nSCARTATI valori\n non corretti !\n");
                                 help.setBackground(Color.red);}

                       if (mess1.equals("*")){
                            mess1="Max="+Double.toString(max);
                       }
                       String mess2=String.format("%.2f",sommatoria/quanti);
                       rigo.setText(mess1+"  Media= "+mess2);
                       s.close();
                       
                 }
                 

            }       
}
            
        

