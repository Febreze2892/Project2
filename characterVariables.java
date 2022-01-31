//programmer: Bailey <3 (lukas added array)
//ask if enum could be used for variables like armor protection(defense)
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;



public class characterVariables {
    private Double health;
    private Double stamina;
    private int food;
    private Double currency;
    private int armor;
    private int inventorySlots; //private int inventorySlots //can't carry more than 20lbs
    private ArrayList<weapons> weaponsInv; //backpack backpack
    //private weapons mainweapon;

    //   O      <-health, stamina, food, currency, 
    //  /|\     <-weapons, armor
    //  /\      <-boosts (potions) 
    
    //constructor

    public characterVariables(Double hpt, Double std, int fuk, Double cun, int lon, int dik, int pen, int arm, int invs){
        health = hpt; stamina = std; food = fuk; currency = cun; armor = arm; inventorySlots = invs;
    }
    // longsword = lon; dagger = dik; pocketKnife = pen;

    //get methods
    public Double getHealth(){return health;}

    public Double getStamina(){return stamina;}

    public int getFood(){return food;}

    public Double getCurrency(){return currency;}

    public int getArmor(){return armor;}

    public int getInventorySlots(){return inventorySlots;}

    //set methods
    public void setHealth(Double hpt){health = hpt;}

    public void setStamina(Double std){stamina = std;}

    public void setFood(int fuk){food = fuk;}

    public void setCurrency(Double cun){currency = cun;}

    public void setArmor(int arm){armor = arm;}

    public void setInventorySlots(int invs){inventorySlots = invs;}
    
    //behaviors
    //do damage; chance to miss
    public Double doDam(){
        double damagedelt=0;
        
        Random ran = new Random();

        return damagedelt;

    }
        //take damage
            //how much damage with/without armor
            //how much damage with/without potions
        //give damage
            //how much damage depending on weapons
            //how much damage depending on boosts

    //picking weapon
        //setting one weapon as the main weapon
        //this allows the character to change a weapon depending on the "boss"
    
    //fallInLove()
        //allows the character to do random actions that may or may not help them
    
    //dieOfStarvation()
        //if hunger is to high, character must die
    
    //dieOfPoverty()
        //if the character has no money, the dragons should eat the player for not being able to pay taxes

    //dieOfOverweight()
        //if they have too many things in inventory they DIE
    public void addWeapon(weapons w){
        weaponsInv.add(w);
        //addWeapon(lpngsword)
        //weapons longsword = new weapon(3297083641927qw094)
    }

ArrayList<String> weapons = new ArrayList<String>();
weapons.add("longsword");
weapons.add("daggers");
weapons.add("pocket knife");
    }
