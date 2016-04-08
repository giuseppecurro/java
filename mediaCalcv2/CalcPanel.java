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
    JTextArea help;
    JLabel info;
   
    public CalcPanel() {
            super();
            help = new JTextArea("Separare \ncon lo spazio ");
            help.setEditable(false);help.setFont(new Font("Serif", Font.ITALIC, 10));
            help.setForeground(Color.blue);
            help.setBackground(Color.yellow);

            txt = new Txt(60);
            calc = new CalcButton("M");
            canc = new CalcButton("C");  
            info = new JLabel("#");
            maxv = new JRadioButton("output del maggiore immesso",false);
            
            add(help);
            add(txt);
            add(calc); add(canc);
            add(info);
            add(maxv);
            
            Calculator c = new Calculator(txt,maxv,info);
            maxv.addActionListener(c);
            calc.addActionListener(c);
            canc.addActionListener(c);
            txt.requestFocus();
            
    }
}
