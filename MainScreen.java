//Programmers: Lukas
//purpose: main player screen

import javax.swing.*;
//import java.awt.*;

public class MainScreen {
    JFrame MS;
    JButton Store; //button that opens the store
    JButton Action; //opens actions menu
    JButton Rest; //rest
    JButton Inv; //opens inventory
    JButton Comb; //fights
    JTextField Text; //input text
    JButton Ent; //enter button for text field
    JLabel Muns; //currency label
    JLabel HP; //health label
    JLabel SP; //stamina label

    MainScreen(){

        Icon Enter = new ImageIcon("enter.png");

        MS = new JFrame();
        MS.setSize(800,600);
        MS.setLayout(null);
        MS.setVisible(true);
        MS.setResizable(false);

        Store = new JButton("Shop");
        Store.setBounds(20, 500, 132, 50);
        MS.add(Store);

        Action = new JButton("Actions");
        Action.setBounds(172, 500, 132, 50);
        MS.add(Action);

        Rest = new JButton("Rest");
        Rest.setBounds(324, 500, 132, 50);
        MS.add(Rest);

        Inv = new JButton("Inventory");
        Inv.setBounds(476, 500, 132, 50);
        MS.add(Inv);

        Comb = new JButton("Fight");
        Comb.setBounds(628, 500, 132, 50);
        MS.add(Comb);

        Text = new JTextField();
        Text.setBounds(160, 430, 400,50);
        MS.add(Text);

        Ent = new JButton(Enter);
        Ent.setBounds(570, 430, 50, 50);
        MS.add(Ent);

        Muns = new JLabel();
        Muns.setBounds(20, 400, 150, 30);
        Muns.setText("Currency Label");
        MS.add(Muns);

        HP = new JLabel("Health");
        HP.setBounds(20, 440, 150, 30);
        MS.add(HP);

        SP = new JLabel("Stamina");
        SP.setBounds(20, 480, 150, 30);
        MS.add(SP);

        

    }

    
    // main for testing purposes
    public static void main(String[] args) {
        new MainScreen();
    }
}