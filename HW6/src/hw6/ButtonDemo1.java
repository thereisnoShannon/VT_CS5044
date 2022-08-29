package hw6;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * 
 *
 * CS 5044 Homework 6 - Button Demo
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */
public class ButtonDemo1 {

    public static void main(String[]args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("shae1223 Click me!");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

