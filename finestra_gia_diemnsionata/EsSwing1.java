//Un esempio di finestra già dimensionata e
//collocata nel punto previsto dello schermo:
import java.awt.*;
import javax.swing.*;
public class EsSwing1
{
    public static void main(String[] v){
        JFrame f = new JFrame("Esempio 1");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBounds(200,100,300,150);
        f.show();
    }
}