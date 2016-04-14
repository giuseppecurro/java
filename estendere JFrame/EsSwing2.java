
//Un approccio efficace consiste nell'estendere
//JFrame, definendo una nuova classe:
import java.awt.*;
import javax.swing.*;

public class EsSwing2 {
    public static void main(String[] v){
        MyFrame f = new MyFrame("Esempio 2");
        f.setSize(400,150);
        f.setVisible(true);
    }
}