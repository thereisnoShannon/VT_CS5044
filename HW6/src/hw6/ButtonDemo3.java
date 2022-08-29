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
 * CS 5044 Homework 6 - Three Button Demo
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */
@SuppressWarnings("serial")
public class ButtonDemo3 extends JPanel implements ActionListener {
    JButton left;
    JButton middle;
    JButton right;
    
    public ButtonDemo3() {
        left = new JButton("Disable >");
        left.setActionCommand("disable");

        middle = new JButton("Middle");
        
        right = new JButton("Enable");
        right.setActionCommand("enable");
        right.setEnabled(false);
        
        left.addActionListener(this);
        right.addActionListener(this);
        
        add(left);
        add(middle);
        add(right);
    }

   public static void createAndShowGUI() {
        JFrame frame = new JFrame("shae1223 ButtonDemo3");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new ButtonDemo3();
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
        if ("disable".equals(e.getActionCommand())) {
            left.setEnabled(false);
            middle.setEnabled(false);
            right.setEnabled(true);
        } else {
            left.setEnabled(true);
            middle.setEnabled(true);
            right.setEnabled(false);
        }
    }
}

