import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Es12Panel extends JPanel implements DocumentListener {
    JTextField txt1, txt2;
    
    public Es12Panel(){
        super();
        txt1 = new JTextField("", 25);
        txt2 = new JTextField(25); txt2.setEditable(false);
        txt1.getDocument().addDocumentListener(this);
        add(txt1);
        add(txt2);
    }
    
    public void insertUpdate(DocumentEvent e){
        txt2.setText(txt1.getText()); 
    }
    
    public void removeUpdate(DocumentEvent e){
        txt2.setText(txt1.getText()); 
    }

    public void changedUpdate(DocumentEvent e){ }
    
    public static void main(String[] v){
            MyFrame f = new MyFrame("Esempio 10");
            Container c = f.getContentPane();
            Es12Panel p = new Es12Panel();
            c.add(p);
            //f.pack(); 
            f.setVisible(true);
    }
}
    