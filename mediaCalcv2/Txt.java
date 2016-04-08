import java.awt.*; 
//import javax.swing.*;
//import javax.swing.JFrame;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import javax.swing.JApplet;
import javax.swing.JTextField;

public class Txt extends JTextField
{
    Font font = new Font("Courier", Font.BOLD,14);
    Color color = Color.RED;
    
    public Txt(int s) {
        super(s);
        this.setFont(font);
        this.setHorizontalAlignment(JTextField.RIGHT); 
        this.setForeground(color);
        this.setText(" ");
        this.setCaretPosition(0);
    }
      
}

