//Programmers: Alessa

import javax.swing.*;
import java.awt.*;

public class playScreen {

    public static void main(String[] args) {
        JFrame playScreen = new JFrame(); // creates frame
        playScreen.setTitle("Dungeons and Dragons");// gives GUI title
        playScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows us to close out of GUI
        playScreen.setResizable(false); // allows us to resize 
        playScreen.setSize(500,500); //sets size of GUI
        playScreen.setVisible(true); // allows the frame to be visible

        ImageIcon guiImage = new ImageIcon("sword.png"); // create an image for our GUI
        playScreen.setIconImage(guiImage.getImage()); //changes icon of our GUI


        playScreen.getContentPane().setBackground(Color.lightGray); //changes background color of GUI
        

        
        
    }

}