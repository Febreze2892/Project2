//Programmers: Luke and lukas
//purpose: main player screen

import javax.swing.*;
//import java.awt.*;

public class MainScreen {
    JFrame MS;
    MainScreen(){
        MS = new JFrame();
        MS.setSize(800,600);
        MS.setLayout(null);
        MS.setVisible(true);
        MS.setResizable(false);
    }

    
    // main for testing purposes
    public static void main(String[] args) {
        new MainScreen();
    }
}