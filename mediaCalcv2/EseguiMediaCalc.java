//Viene creata una finestra ed un contenitore
//Su quest'ultimo poggia un pannello "tuttofare"
//
import java.awt.*; 
import javax.swing.*;

public class EseguiMediaCalc {               
           
    public static void main(String[] v){
            JFrame f = new JFrame("Calcolo della media di una serie di valori");
            Container c = f.getContentPane();
            CalcPanel p = new CalcPanel( );
            c.add(p);
            f.setSize(680,120);
            f.setVisible(true);
    }
}


