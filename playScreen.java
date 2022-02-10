

import javax.swing.*;
import java.awt.*;

public class playScreen {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton;

   


    public static void main(String[] args){
         
        new playScreen();
         
    
    }

    public playScreen(){

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        con = window.getContentPane();
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(window.getWidth()/3, 100, 600, 150);
        titleNamePanel.setBackground(Color.blue);

        titleNameLabel = new JLabel("DUNGEONS AND DRAGONS");
        titleNameLabel.setBounds(10,10,7000,7000);
      //  titleNameLabel.setForeground(Color.white);
        titleNameLabel.setBackground(Color.green);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(860, 400, 200, 100);
        //startButtonPanel.setBackground(Color.black);

        startButton = new JButton("PLAY");
        startButton.addActionListener((e) -> {
            window.setVisible(false);
            RoleScreenGUI.main(null); 
        });
        startButton.setBackground(Color.red);
        startButton.setBounds(4,2,startButtonPanel.getWidth(),startButtonPanel.getHeight());
       // startButton.setForeground(Color.white);
       // startButton.setFont(normalFont);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);

        ImageIcon sword = new ImageIcon("sword.png");
        window.setIconImage(sword.getImage());
    }


}


    


        
//     }

// }