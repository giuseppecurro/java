//Nel pannello verranno posti il textfield e due pulsanti, inoltre
//Verrà creata un'istanza della classe Calculator: c
//I due pulsanti hanno ciascuno un ascoltatore: proviene da c,Calculator
import java.awt.*; 
import javax.swing.*;
import javax.swing.JFrame;

      
class CalcPanel extends JPanel {
    Campo_input rigo;
    CalcButton calc, canc;
    JRadioButton maxv;
    Help help;
   
    public CalcPanel() {
            super();            
            rigo = new Campo_input();
            calc = new CalcButton("M");
            canc = new CalcButton("C");
            help = new Help();
            add(help);
            maxv = new JRadioButton("output del maggiore immesso",false);           
            add(rigo);
            add(calc); add(canc);
            add(maxv);            
            Calculator c = new Calculator(rigo,maxv,help);
            maxv.addActionListener(c);
            calc.addActionListener(c);
            canc.addActionListener(c);
            //rigo.(JTextField) getFocused();            
    }
}
