import java.awt.*;

public class FinestraChiudibile
{
 public static void main(String[] args){
     Frame f = new Frame("Finestra grafica chiudibile");
     f.setSize(500,500);
     f.setLocation(100,100);
     f.setVisible(true);
     f.addWindowListener(new GestoreFinestra());
 }
}

