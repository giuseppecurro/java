import java.awt.*;

public class Finestra
{
 public static void main(String[] args){
     Frame f = new Frame("Finestra grafica NON chiudibile");
     f.setSize(500,500);
     f.setLocation(100,100);
     f.setVisible(true);
 }
}