import java.awt.*; 
import javax.swing.*;


public class Help extends JTextArea {
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
