// programmer: yours truly, bailey
// import javax.swing.*;
// import java.awt.*;

// public class roleScreen{
//     JFrame window;
//     Container con; //component that can contain other AWT components. it has many layers, with content pane being the one that holds the objects
//     JPanel titleNamePanel, startButtonPanel; //see, i have two seperate panels so thats why i named them differently
//     JLabel titleNameLabel;
//     Font titleFont = new Font("Times New Roman", Font.PLAIN, 40); //custom font yeahh poggers

//     public static void main(String []args){

//         new roleScreen();

//     }
    
//     public roleScreen(){

//         window = new JFrame();
//         window.setSize(800,600); // our resolution please keep this consistent with other screens.
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows you to close out of frame
//         window.getContentPane().setBackground(Color.black); //literally pane of content, you set the background color of your content pane
//         window.setLayout(null); 
//         window.setVisible(true); // allows you to see the frame
//         con = window.getContentPane();

//         window = new JFrame(); 
//         window.setSize(800,600); 
//         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows the window to be closed
//         window.getContentPane().setBackground(Color.black); //with this line, you are modifying an object with a method. according to the rule that concerns modifying objects
//         //with methods, the object will always be to the left side of the period, while your method will always be found on the right. in this case, our object is getContenPane, 
//         //which retrieves the content pane so that you may add objects to it. setBackground would be our method; although technically we are not adding an object, we are
//         //modifying the color of the pane itself.
//         window.setLayout(null);
//         window.setVisible(true);
//         con = window.getContentPane(); //


//         titleNamePanel = new JPanel(); //i named it titleNamePanel to differentiate between other JPanels that I create 
//         titleNamePanel.setBounds(100, 100, 600, 150); //boundaries/size measured in pixels
//         titleNamePanel.setBackground(Color.black);
//         titleNameLabel = new JLabel("Choose Your Role"); //label that is displayed within the panel
//         titleNameLabel.setForeground(Color.white); //foreground is letters
//         titleNameLabel.setFont(titleFont); //use custom font


//         titleNamePanel.add(titleNameLabel); //appends titleNameLabel to titleNamePanel
//         con.add(titleNamePanel); //appends titleNamePanel to con
  

//     }
// }
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
public class RoleScreenGUI  {
    

      public static void main(String[]args){
  
      
        //start of Barbarian   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JPanel Barbpanel = new JPanel();
        JLabel Barblabel= new JLabel("Barbarian");
        JPanel Bpanel = new JPanel();
        JButton Barbbutton = new JButton("Choose Barbarian");
        
        



        Barblabel.setSize(200,100);
        
        Barbbutton.setSize(200,200);

        //Border BarbBorder = BorderFactory.createEmptyBorder();//removes border
        //Bpanel.setBorder(BarbBorder);//removes border

        Barbpanel.add(Barbbutton);
        
        Barbpanel.setBounds(350, 250, 400, 500);
        Border BarbaBorder = BorderFactory.createMatteBorder(2, 2, 0, 1, Color.BLACK);
        Barbpanel.setBorder(BarbaBorder);
        Bpanel.setBounds(350, 750, 400, 75);
        Barbbutton.setBounds(350, 750, 400, 75);
        Border BarbBorder = BorderFactory.createMatteBorder(0, 2, 2, 1, Color.BLACK);
        Bpanel.setBorder(BarbBorder);
        Barblabel.setFont(new FontUIResource("Times New Roman", Font.BOLD, 30));
        Barbbutton.setFont(new FontUIResource("Times New Roman", Font.BOLD, 50));
       
        //end of Barbarian

        //start of Mage /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JPanel Magepanel = new JPanel();
        JLabel Magelabel= new JLabel("Mage");
        JPanel Mpanel = new JPanel();
        JButton Magebutton = new JButton("Choose Mage");
        /*Magebutton.addActionListener(new ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e) {

            
          }
      });*/
      Magelabel.setSize(200,500);
      Magebutton.setSize(200,200);

        //Border MageBorder = BorderFactory.createEmptyBorder();//removes border
        //removes border

        Mpanel.add(Magebutton);

        Magepanel.setBounds(750, 250, 375, 500);
        Border MagaBorder = BorderFactory.createMatteBorder(2, 1, 0, 1, Color.BLACK);
        Magepanel.setBorder(MagaBorder);
        Mpanel.setBounds(750, 750, 375, 75);
        Magebutton.setBounds(1125, 750, 375, 75);
        Border MageBorder = BorderFactory.createMatteBorder(0, 1, 2, 1, Color.BLACK);
        Mpanel.setBorder(MageBorder);
        Magelabel.setFont(new FontUIResource("Times New Roman", Font.BOLD, 30));
        Magebutton.setFont(new FontUIResource("Times New Roman", Font.BOLD, 58));
        
        
        
        JPanel Rougpanel = new JPanel();
        JLabel Rouglabel= new JLabel("Rogue");
        JPanel Rpanel = new JPanel();
        JButton Rougbutton = new JButton("Choose Rogue");
        /*Rougbutton.addActionListener(new ActionListener(){

          @Override
          public void actionPerformed(ActionEvent e) {

            
            
          }
      });*/
      Rouglabel.setSize(300,100);
      Rougbutton.setSize(400,200);
//removes border
        //removes border
        
        Rpanel.add(Rougbutton);

        Rougpanel.setBounds(1125, 250, 400, 500);
        Border RougeBorder = BorderFactory.createMatteBorder(2, 1, 0, 2, Color.BLACK);
        Rougpanel.setBorder(RougeBorder);
        Rpanel.setBounds(1125, 750, 400, 75);
        Rougbutton.setBounds(1125, 750, 400, 75);
        Border RougBorder = BorderFactory.createMatteBorder(0, 1, 2, 2, Color.BLACK);
        Rpanel.setBorder(RougBorder);
        Rouglabel.setFont(new FontUIResource("Times New Roman", Font.BOLD, 30));
        Rougbutton.setFont(new FontUIResource("Times New Roman", Font.BOLD, 58));
      
          //font f = new.

            final FontUIResource f = new FontUIResource("Times New Roman", Font.BOLD, 38);


          JLabel label = new JLabel();

          label.setText("Select Your Role");
          label.setBounds(800,-100, 1000, 700);
          label.setVisible(true);

          label.setSize(1000, 650);
         label.setFont(new FontUIResource("Times New Roman", Font.BOLD, 50));
         label.setFont(f);


        JFrame characterSelect  = new JFrame();

        characterSelect.setSize(800, 600);
        characterSelect.setTitle("Select Your Role");
        characterSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterSelect.setVisible(true);
        characterSelect.pack();
        //characterSelect.setSize(1280,720);
        characterSelect.setLayout(null);
        characterSelect.setExtendedState(JFrame.MAXIMIZED_BOTH);
        characterSelect.add(Barbpanel);
        characterSelect.add(Magepanel);
        characterSelect.add(Rougpanel);
        characterSelect.add(Bpanel);
        characterSelect.add(Mpanel);
        characterSelect.add(Rpanel);

        characterSelect.add(label);
        Barbpanel.add(Barblabel);
        Bpanel.add(Barbbutton);
        Magepanel.add(Magelabel);
        Mpanel.add(Magebutton);
        Rougpanel.add(Rouglabel);
        Rpanel.add(Rougbutton);
        
      
    }
}
