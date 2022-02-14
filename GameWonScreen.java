

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;


public class GameWonScreen {
    public static void main(String args[]){
        makeGameWonScreen();
    }
    
     public static void makeGameWonScreen(){
        JFrame EFrame = new JFrame("GameWonScreen");
        GridLayout grid = new GridLayout(7,7);

        JPanel EPanel1 = new JPanel();
        JPanel EPanel2 = new JPanel();
        JPanel EPanel3 = new JPanel();
        JPanel EPanel4 = new JPanel();

        EPanel3.setLayout(grid);
        JLabel Etitle = new JLabel("(You Win!!!)");
        Etitle.setFont(new Font("Impact", Font.PLAIN, 20));
        JButton EButton4 = new JButton("Inventory");
        JButton EButton3 = new JButton("Continue");
        Etitle.setFont(new Font("Impact", Font.PLAIN, 20));
        JButton EButton5 = new JButton("Retry");
        

        JButton EButton6 = new JButton("Back");
        EButton6.addActionListener((e) ->{
                   // Go Back
                } );






        EPanel1.add(Etitle);
        //EPanel2.add(Etitle2);
        
        EPanel3.add(EPanel1);
        EPanel3.add(EPanel2);
        EPanel3.add(EPanel4);
        EPanel4.add(EButton4);
        EPanel4.add(EButton3);
        EPanel4.add(EButton3);
  
        EFrame.add(EPanel3);
        EFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        EFrame.setVisible(true);
        EFrame.setUndecorated(true);








        
        
        

     
    }
}
          

        

