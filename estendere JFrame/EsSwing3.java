//Aggiunta di un pannello al Container di un
//frame, tramite l'uso di getContentPane()
import java.awt.*; import javax.swing.*;
public class EsSwing3 {
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 3");
        f.setSize(300,150);
        Container c = f.getContentPane();
        JPanel panel = new JPanel();
        c.add(panel);
        f.setVisible(true);
    }
}
