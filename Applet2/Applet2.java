import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Applet2 extends JApplet {
    JButton redButton, blueButton, greenButton;
    JTextField messaggio;
    
    public void init() {
        Container c = getContentPane();
        // il contenitore che contiene la applet
        c.setBackground(SystemColor.window);
        c.setLayout(new FlowLayout());
        redButton = new JButton("Rosso");
        blueButton = new JButton("Azzurro");
        greenButton = new JButton("Verde");
        messaggio = new JTextField(26);
        messaggio.setText("Premere un pulsante");
        messaggio.setEditable(false);
        // i componenti non vanno aggiunti alla applet
        // ma al contenitore che la contiene
        c.add(messaggio); c.add(redButton);
        c.add(blueButton); c.add(greenButton);
        redButton.addActionListener(new
        Applet2Listener(this, Color.red, messaggio));
        blueButton.addActionListener(new
        Applet2Listener(this, Color.cyan, messaggio));
        greenButton.addActionListener(new
        Applet2Listener(this, Color.green, messaggio));
    }
    
    class Applet2Listener implements ActionListener {
        JApplet app; Color colore; JTextField txt;
        
        public Applet2Listener(JApplet a, Color c, JTextField t){
            app = a; colore = c; txt = t;
        }    
    
    
        public void actionPerformed(ActionEvent e){
            app.getContentPane().setBackground(colore);
            txt.setText("Premuto il pulsante " +
            e.getActionCommand());
            app.repaint();
        }

    }
}

