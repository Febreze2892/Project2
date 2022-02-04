
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class endingscreen {
    public static void main(String args[]){
        JFrame frame = new JFrame("basicgui");
        JPanel panel = new JPanel();


        JLabel label = new JLabel("Game Over: ");
        label.setFont (new Font ("Courier New", Font.BOLD, 90));

        JButton button = new JButton("Play Again");
        button.setFont(new Font("Times New Roman", Font.BOLD, 40));


        ImageIcon picc = new ImageIcon("StartingScreenProject/font/Tom Holland yayyyyy (3).png");
        JLabel pp = new JLabel(picc);
        pp.setBounds(30,30,30,30);
 
        panel.add(pp);
        panel.add(label);
        panel.add(button);


        frame.add(panel);
        frame.setSize(900,800);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

    }

}