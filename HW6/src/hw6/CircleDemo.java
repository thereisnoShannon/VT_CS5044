package hw6;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 * 
 *
 * CS 5044 Homework 6 - Circle Demo
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */

@SuppressWarnings("serial")
public class CircleDemo extends JPanel implements MouseListener {
    private int x = 200;
    private int y = 200;
    private String text = "(200, 200)";
    private Action spaceAction;

    public CircleDemo() {
        this.addMouseListener(this);
        
        spaceAction = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                x = 200;
                y = 200;
                text = "(200, 200)";
                repaint();
            }
        };
        
        getInputMap().put(KeyStroke.getKeyStroke(' '), "doSpaceAction");
        getActionMap().put("doSpaceAction", spaceAction);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("shae1223 CircleDemo");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new CircleDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setSize(400, 400);
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
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.BLUE);
        g.fillOval(x - 50, y - 50, 100, 100);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Verdana", Font.BOLD, 24));
        g.drawString(text, 125, 50);
    }

    void eventOutput(String eventDescription, MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "(" + x + ", " + y + ")";
        repaint();        
    }


}
