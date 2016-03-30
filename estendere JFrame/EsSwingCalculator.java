import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JFrame;

public class EsSwingCalculator {
        
            static class CalcButton extends JButton {    
                CalcButton(String n){  
                    super(n);
                    setFont(new Font("Courier",Font.BOLD,20));
                }
            }    
        
            static class CalcPanel extends JPanel {
                JTextField txt;
                CalcButton sum, sub, mul, div, calc, canc;
               
                public CalcPanel() {
                        super();
                        txt = new JTextField(15);
                        txt.setHorizontalAlignment(JTextField.RIGHT);
                        calc = new CalcButton("=");
                        sum = new CalcButton("+");
                        sub = new CalcButton("-");
                        mul = new CalcButton("*");
                        div = new CalcButton("/");
                        canc = new CalcButton("C");  
                        add(txt);
                        add(sum); add(sub); add(mul);
                        add(div); add(calc); add(canc);
                        Calculator calcolatore = new Calculator(txt);
                        sum.addActionListener(calcolatore);
                        sub.addActionListener(calcolatore);
                        mul.addActionListener(calcolatore);
                        div.addActionListener(calcolatore);
                        calc.addActionListener(calcolatore);
                        canc.addActionListener(calcolatore);
                 }
            }
            
            
            static class Calculator implements ActionListener {
                double res = 0; 
                JTextField display;
                String opPrec = "nop";
                
                public Calculator(JTextField t) {
                    display = t; 
                }
                
                public void actionPerformed(ActionEvent e){
                     double valore =
                     Double.parseDouble(display.getText());
                     display.setText("");
                     display.requestFocus();
                     String operazione = e.getActionCommand();
                     if (operazione.equals("C")) { 
                         res = valore = 0; 
                         opPrec = new String("nop");
                     } else { 
                               if (opPrec.equals("+")) res += valore; 
                               else if (opPrec.equals("-")) res -= valore; 
                               else if (opPrec.equals("*")) res *= valore; 
                               else if (opPrec.equals("/")) res /= valore; 
                               else if (opPrec.equals("nop")) res = valore;
                               display.setText(""+res);
                               opPrec = operazione;
                            }
                }       
            }
            
                                   
        public static void main(String[] v){
                JFrame f = new JFrame("Mini-calcolatrice");
                Container c = f.getContentPane();
                CalcPanel p = new CalcPanel( );
                c.add(p);
                f.setSize(220,150);
                //f.addWindowListener(new  Terminator());
                f.setVisible(true);
        }
}
