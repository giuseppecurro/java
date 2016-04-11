
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.util.*;

public class EseguiMediaCalc extends JApplet {
    
        public void init()
        {
            // questo è un trucco per aggirare un conflitto di sicurezza con i browser
            // attuali, compresi Netscape e Internet Explorer, i quali non consentono
            // l'accesso alla coda di eventi di sistema di AWT tentato dai JApplet.
            JRootPane rootPane = this.getRootPane();    
            rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
        
            // aggiungi tutte le inizializzazioni necessarie al JApplet          
    
        }
    
        /**
         * Richiamato dal browser o dall'appletviewer per informare il JApplet che
         * dovrebbe essere avviata l'esecuzione. E' richiamato dopo il metodo init
         * e ogni volta che il JApplet è caricato in una pagina Web.
         */
        public void start()
        {
            EseguiMediaCalc.main(new String[0]);
            // aggiungi il codice necessario all'avvio
            // ogni volta che è caricata una pagina web
    
        }
    
    
        public void stop()
        {
            // aggiungi il codice da eseguire quando la pagina è
            // sostituita da un'altra pagina o prima che il JApplet sia distrutto
        
        }
    
        public void destroy()
        {
            // aggiungi il codice che dev'essere eseguito subito
            // prima della distruzione del JApplet.
        
        }
    
    
        public String getAppletInfo()
        {
            // aggiungi le principali informazioni riguardo l'applet.
            return "Titolo: EseguiMediaCalc2a  \nAutore: cg  \nSemplice calcolo media di double. ";
        }
    
       
    static  class Help extends JTextArea {
       String text = "\n\nSeparare i dati immessi\ncon lo SPAZIO.\n\nUsare la VIRGOLA \ncon i decimali.\n"; 
       public Help (){
           super(7,10);
           setBackground(Color.yellow);
           setForeground(Color.blue);
           setFont(new Font("Serif", Font.ITALIC, 10));
           setEditable(false);
           append(text);
       } 
       void accoda(String s){
           append(s);
       }    
    }    
        
    static class CalcButton extends JButton {    
        CalcButton(String n){  
            super(n);
            setFont(new Font("Courier",Font.BOLD,15));
        }
    }    
            
        
    static class Campo_input extends JTextField {
        Font font = new Font("Courier", Font.BOLD,14);
        Color color = Color.RED;
        
        public Campo_input() {
            super(50);
            this.setFont(font);
            this.setHorizontalAlignment(JTextField.RIGHT); 
            this.setForeground(color);
            this.setSize(400,20);
            this.setCaretPosition(0);
            this.setText("");
        }
          
    }
        
    
    
    static class Calculator implements ActionListener {
                Campo_input rigo;
                Help help;
                JRadioButton radio;
                String text0 = "\n\nSeparare i dati immessi\ncon lo SPAZIO.\n\nUsare la VIRGOLA \ncon i decimali.\n"; 
                String mess2;
      
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
                     String s4edit; 
                 
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
                           s4edit = rigo.getText();
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
                                     break;
                                 }    
                           }
                           
                           if (n>quanti) {
                                 help.accoda("\n\nPRESENTI valori\n non corretti !\n");
                                 help.setBackground(Color.orange);
                                 
                           }
    
                           if (mess1.equals("*")){
                                mess1="Max="+Double.toString(max);
                           }
                           
                           if (n==quanti) {
                                mess2=String.format("%.2f",sommatoria/quanti);
                                rigo.setText(mess1+"  Media= "+mess2);
                                s.close();
                           }
                           else {
                                mess2="";
                                mess1="";
                                rigo.setText(s4edit);
                           }     
                                                 
                     }
                     
                 }       
    }
        
        
    static class CalcPanel extends JPanel {
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
        }
    }
        
      
    public static void main(String[] v){
                JFrame f = new JFrame("Calcolo della media di una serie di valori");
                Container c = f.getContentPane();
                CalcPanel p = new CalcPanel( );
                c.add(p);
                f.setSize(639,199);
                f.setVisible(true);
    }
  
}//class EseguiMediaCalc
