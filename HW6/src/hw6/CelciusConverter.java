package hw6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 *
 * CS 5044 Homework 6 - Celcius Converter
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */
@SuppressWarnings("serial")
public class CelciusConverter extends JPanel implements ActionListener {
    private final JButton convertButton;
    private final JLabel celsiusLabel;
    private final JLabel fahrenheitLabel;
    private final JTextField textField; 
    
    public CelciusConverter() {
        convertButton = new JButton("Convert");
        celsiusLabel = new JLabel("Celsius");         
        fahrenheitLabel = new JLabel("Fahrenheit");        
        textField = new JTextField(8);
        
        convertButton.addActionListener(this);
        this.add(convertButton);
        
        JPanel topPanel = new JPanel();
        topPanel.add(textField);
        topPanel.add(celsiusLabel);

        JPanel botPanel = new JPanel();
        botPanel.add(convertButton);
        botPanel.add(fahrenheitLabel);
        
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.PAGE_START);
        add(botPanel, BorderLayout.CENTER);
    }  
    
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("shae1223 CelciusConverter");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new CelciusConverter();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setSize(335, 125);
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
        int tempFahr = (int)((Double.parseDouble(textField.getText())) * 1.8 + 32);
        
        fahrenheitLabel.setText(tempFahr + " Fahrenheit");
    }
}

