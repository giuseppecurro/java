
//Un approccio efficace consiste nell'estendere
//JFrame, definendo una nuova classe:
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    public MyFrame()  {
        super(); 
    }
    
    public MyFrame(String titolo)  {
        super(titolo);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(1000,50,300,400);
    }
}