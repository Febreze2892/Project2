//Programmers: Luke and lukas
//purpose: main player screen

import javax.swing.*;
import java.awt.*;

public class MainScreen {
    JFrame MS;
    MainScreen(){
        MS = new JFrame();
        MS.setSize(600,800);
        MS.setVisible(true);

    }
    // main for testing purposes
    public static void main(String[] args) {
        new MainScreen();
    }
}