//Programmers: Alessa

// import javax.swing.*;
// import java.awt.*;

// public class playScreen {

//     public static void main(String[] args) {
//         JFrame playScreen = new JFrame(); // creates frame
//         playScreen.setTitle("Dungeons and Dragons");// gives GUI title
//         playScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows us to close out of GUI
//         playScreen.setResizable(false); // allows us to resize 
//         playScreen.setSize(800,600); //sets size of GUI
//         playScreen.setVisible(true); // allows the frame to be visible

//         ImageIcon guiImage = new ImageIcon("sword.png"); // create an image for our GUI
//         playScreen.setIconImage(guiImage.getImage()); //changes icon of our GUI


//         playScreen.getContentPane().setBackground(Color.lightGray); //changes background color of GUI

//Programmer: Bailey
//ask mendoza about creating separate lines and double box

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

    // public static void main(String[] args) {
    //     JFrame playScreen = new JFrame(); // creates frame
    //     playScreen.setTitle("Dungeons and Dragons");// gives GUI title
    //     playScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows us to close out of GUI
    //     playScreen.setResizable(false); // allows us to resize 
    //     playScreen.setSize(800,600); //sets size of GUI
    //     playScreen.setVisible(true); // allows the frame to be visible
        
    //     ImageIcon guiImage = new ImageIcon("sword.png"); // create an image for our GUI
    //     playScreen.setIconImage(guiImage.getImage()); //changes icon of our GUI


    public static void main(String[] args){
        
        new playScreen();
    
    }

    public playScreen(){

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("DUNGEONS AND DRAGONS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("PLAY");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

}


    


        
//     }

// }