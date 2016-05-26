import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class MioProgram{ 
            private static JFrame f;
            private static JTextField tf;   
            private static JRadioButton radio;
            private static JRadioButton radio2;
            private static ButtonGroup bg;
            private static JPanel p;
            private static Container c;
           
    public static void main(String[] v){
            //Calcolo k;
            f        = new JFrame("Conversione");
            tf   = new JTextField(10);   
            radio2 =new JRadioButton("esa-dec");
            radio= new JRadioButton("dec-esa");
            bg= new ButtonGroup();
            p        = new JPanel();
            c     = f.getContentPane();
            
            
            bg.add(radio);
            bg.add(radio2);
            p.add(tf);
            c.add(p);
            p.add(radio);
            p.add(radio2);
            
            //k=new Calcolo(tf, radio, radio2,  tf1, risu);
           
            radio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        
                String operazione = e.getActionCommand();
                
                if (operazione.equals("dec-esa")){
                      String s=tf.getText().toString();
                    try{
                        tf.setText(Integer.toHexString(Integer.parseInt(s)));
                    }
                    catch  ( NumberFormatException e2 ) {
                        tf.setText("errore");
                    }
            } 
                }
                
            
            });
            radio2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        
                String operazione = e.getActionCommand();
                
                if (operazione.equals("esa-dec")){
                    String s=tf.getText().toString();
                    try{
                        int n=Integer.parseInt(s, 16);
                        tf.setText(Integer.toString(n));
                    }
                    catch  ( NumberFormatException e2 ) {
                        tf.setText("errore");
                    }  
                }
            }
            });
            
            f.setSize(639,199);
            f.setVisible(true);
    }
    
    
}