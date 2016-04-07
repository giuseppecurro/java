//Nel pannello verranno posti il textfield e due pulsanti, inoltre
//Verrà creata un'istanza della classe Calculator: c
//I due pulsanti hanno ciascuno un ascoltatore: proviene da c,Calculator
import java.awt.*; 
import javax.swing.*;
import javax.swing.JFrame;

      
class CalcPanel extends JPanel {
    public JTextField txt;
    CalcButton calc, canc;
    JRadioButton maxv;
   
    public CalcPanel() {
            super();
            txt = new JTextField(30);
            txt.setHorizontalAlignment(JTextField.RIGHT);
            calc = new CalcButton("M");
            canc = new CalcButton("C");  
            maxv = new JRadioButton("output del maggiore immesso",false);
            add(txt);
            add(calc); add(canc);
            add(maxv);
            Calculator c = new Calculator(txt,maxv);
            maxv.addActionListener(c);
            calc.addActionListener(c);
            canc.addActionListener(c);
     }
}
