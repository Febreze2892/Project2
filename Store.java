import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Store extends MainScreen{
  //  JFrame ST;
    static JFrame ST;


    public static void main(String[]args){
        ST = new JFrame();
        ST.setSize(800,600);
        ST.setLayout(null);
        ST.setVisible(true);
        ST.setResizable(false);
        ///////////food//////////////////food///////////////////////food/////////////////////food/////////////////////food/////////////food//////////////////
        JButton BuyPiclke = new JButton();
        BuyPiclke.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //munsey-=4;
                add2Munsey(-4);
                
            }
        });

        
        JButton Buymuffin = new JButton();
        Buymuffin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-10);
                
            }
        });

        JButton Buycookie = new JButton();
        Buycookie.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-10);
                
            }
        });

        JButton Buybread = new JButton();
        Buybread.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-5);
                
            }
        });

        JButton Buycookedchicken = new JButton();
        Buycookedchicken.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-20);
                
            }
        });
        ///////////Weapons//////////////////////Weapons////////////////////////////Weapons///////////////////////////Weapons///////////////////////////Weapons/////////////////////////////////////////////////

        JButton Buylongsword = new JButton();
        Buylongsword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-20);
                
            }
        });

        JButton Buydagger = new JButton();
        Buydagger.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-15);
                
            }
        });

        JButton Buypocketknife = new JButton();
        Buypocketknife.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-10);
                
            }
        });
        ////////armor/////////////////armor///////////armor//////////////////////armor//////////////////////////armor///////////////////////////////////armor//////////////////

        JButton Buyiron = new JButton();
        Buyiron.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-20);
                
            }
        });

        JButton Buygold = new JButton();
        Buygold.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-30);
                
            }
        });

        JButton Buyleather = new JButton();
        Buyleather.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-5);
                
            }
        });
////////////Potions////////////////////////////////Potions///////////////////////////////////////////Potions////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton Buyhealth = new JButton();
        Buyhealth.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-25);
                
            }
        });

        JButton Buystamina = new JButton();
        Buystamina.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-25);
                
            }
        });

        JButton Buydamage = new JButton();
        Buydamage.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                add2Munsey(-30);
                
            }
        });
            //////////////////end of dem buttons//////////////////////////////////////////////////////////////////////////////////////////
        

        
    }

}