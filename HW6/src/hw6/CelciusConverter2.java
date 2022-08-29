package hw6;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
 * CS 5044 Homework 6 - Celcius Converter2
 *
 * @author Shannon Smith (shae1223)
 * @version 2022.07.25
 *
 */
@SuppressWarnings("serial")
public class CelciusConverter2 extends JPanel implements ActionListener {
    private final JButton convertButton;
    private final JLabel celsiusLabel;
    private final JLabel fahrenheitLabel;
    private final JTextField textField; 
    
    public CelciusConverter2() {
        
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        this.add(convertButton);
        
        celsiusLabel = new JLabel("Celsius"); 
        this.add(celsiusLabel);
        
        fahrenheitLabel = new JLabel("Fahrenheit");
        this.add(fahrenheitLabel);
        
        textField = new JTextField(8);
        this.add(textField);
        
        Container panel = new JPanel();

        JPanel firstPanel = new JPanel();
        firstPanel.add(textField);
        firstPanel.add(celsiusLabel);
        
        JPanel secondPanel = new JPanel();
        secondPanel.add(convertButton);
        secondPanel.add(fahrenheitLabel);

        setLayout(new GridBagLayout());
          
        GridBagLayout gb = new GridBagLayout();
        this.setLayout(gb);
        GridBagConstraints gbc = new GridBagConstraints();
         
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        //other panels...

        //panels in question
        //this will tell GridBagLayout component below should be last one on this line.
        gbc.gridwidth = GridBagConstraints.REMAINDER; 
        gb.setConstraints(firstPanel, gbc);
        this.add(firstPanel);
        
        gb.setConstraints(secondPanel, gbc);
        this.add(secondPanel);
        
        add(panel);
    }  
    
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("shae1223 CelciusConverter");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new CelciusConverter2();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.setSize(335, 110);
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

