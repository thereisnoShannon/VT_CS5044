package hw6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 *
 * CS 5044 Homework 6 - Button Demo
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */
@SuppressWarnings("serial")
public class ButtonDemo extends JPanel implements ActionListener {
    JButton button;
    
    public ButtonDemo() {
        button = new JButton("Click me!");
        button.addActionListener(this);
        this.add(button);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("shae1223 ButtonDemo");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new ButtonDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Ouch!");
    }
}
