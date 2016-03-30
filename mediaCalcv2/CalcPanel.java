//Nel pannello verranno posti il textfield e due pulsanti, inoltre
//Verrà creata un'istanza della classe Calculator: c
//I due pulsanti hanno ciascuno un ascoltatore: proviene da c,Calculator
import java.awt.*; 
import javax.swing.*;
import javax.swing.JFrame;

      
class CalcPanel extends JPanel {
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
            Calculator c = new Calculator(txt);

            calc.addActionListener(c);
            canc.addActionListener(c);
     }
}
