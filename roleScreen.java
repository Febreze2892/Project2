// programmer: yours truly, bailey
import javax.swing.*;
import java.awt.*;

public class roleScreen{
    JFrame window;
    Container con; //component that can contain other AWT components. it has many layers, with content pane being the one that holds the objects
    JPanel titleNamePanel, startButtonPanel; //see, i have two seperate panels so thats why i named them differently
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 40); //custom font yeahh poggers

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

        window = new JFrame(); 
        window.setSize(800,600); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows the window to be closed
        window.getContentPane().setBackground(Color.black); //with this line, you are modifying an object with a method. according to the rule that concerns modifying objects
        //with methods, the object will always be to the left side of the period, while your method will always be found on the right. in this case, our object is getContenPane, 
        //which retrieves the content pane so that you may add objects to it. setBackground would be our method; although technically we are not adding an object, we are
        //modifying the color of the pane itself.
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane(); //


        titleNamePanel = new JPanel(); //i named it titleNamePanel to differentiate between other JPanels that I create 
        titleNamePanel.setBounds(100, 100, 600, 150); //boundaries/size measured in pixels
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Choose Your Role"); //label that is displayed within the panel
        titleNameLabel.setForeground(Color.white); //foreground is letters
        titleNameLabel.setFont(titleFont); //use custom font


        titleNamePanel.add(titleNameLabel); //appends titleNameLabel to titleNamePanel
        con.add(titleNamePanel); //appends titleNamePanel to con
  

    }
}