import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JFrame;
import java.util.*; 

public class MediaCalc {
    
        
            static class CalcButton extends JButton {    
                CalcButton(String n){  
                    super(n);
                    setFont(new Font("Courier",Font.BOLD,15));
                }
            }    
        
            static class CalcPanel extends JPanel {
                JTextField txt;
                CalcButton calc, canc;
               
                public CalcPanel() {
                        super();
                        txt = new JTextField(30);
                        txt.setHorizontalAlignment(JTextField.RIGHT);
                        calc = new CalcButton("M");
                        canc = new CalcButton("C");  
                        
                        add(txt);
                        add(calc); add(canc);
                        Calculator calcolatore = new Calculator(txt);

                        calc.addActionListener(calcolatore);
                        canc.addActionListener(calcolatore);
                 }
            }
            
            
            static class Calculator implements ActionListener {
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
            
        
        
        public static void main(String[] v){
                JFrame f = new JFrame("Calcolo della media di una serie di valori");
                Container c = f.getContentPane();
                CalcPanel p = new CalcPanel( );
                c.add(p);
                f.setSize(480,120);

                f.setVisible(true);
        }
}


