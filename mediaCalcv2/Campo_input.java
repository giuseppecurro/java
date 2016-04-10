import java.awt.*; 
import javax.swing.JTextField;

class Campo_input extends JTextField {
    Font font = new Font("Courier", Font.BOLD,14);
    Color color = Color.RED;
    
    public Campo_input() {
        super(50);
        this.setFont(font);
        this.setHorizontalAlignment(JTextField.RIGHT); 
        this.setForeground(color);
        this.setSize(400,20);
        this.setCaretPosition(0);
        this.setText("");
    }
      
}

