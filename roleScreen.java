//programmer: Bailey <3
//ask if enum could be used for variables like armor protection(defense)

import javax.swing.*;
import java.awt.*;

// class roleScreen{
//     private Double hp;
//     private Double stamina;
//     private int food;
//     private Double currency;
//     private int longsword;
//     private int dagger;
//     private int pocketKnife;
//     private int armor;
//     private Double damage;
// }

public class roleScreen{
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);

    public static void main(String []args){

        new roleScreen();

    }
    
    public roleScreen(){
        window = new JFrame();
        window.setSize(800,600); // our resolution please keep this consistent with other screens.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows you to close out of frame
        window.getContentPane().setBackground(Color.black); //literally pane of content, you set the background color of your content pane
        window.setLayout(null); 
        window.setVisible(true); // allows you to see the frame
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Choose Your Role");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);


        titleNamePanel.add(titleNameLabel);
        con.add(titleNamePanel);

        ImageIcon sword = new ImageIcon("sword.png");
        window.setIconImage(sword.getImage());
  

    }
}