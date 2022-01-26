//programmer: Bailey <3
//ask if enum could be used for variables like armor protection(defense)

public class characterVariables {
    private Double health;
    private Double stamina;
    private int food;
    private Double currency;
    private int longsword;
    private int dagger;
    private int pocketKnife;
    private int armor;
    //private ArrayList<weapons> weapons; //backpack backpack
    //private weapons mainweapon;
    //private int inventorySlots //can't carry more than 20lbs

    //   O      <-health, stamina, food, currency, 
    //  /|\     <-weapons, armor
    //  /\      <-boosts (potions) 

    //constructor

    public characterVariables(Double hpt, Double std, int fuk, Double cun, int lon, int dik, int pen, int arm){
        health = hpt; stamina = std; food = fuk; currency = cun; longsword = lon; dagger = dik; pocketKnife = pen; armor = arm;
    }

    //get methods
    public Double getHealth(){return health;}

    public Double getStamina(){return stamina;}

    public int getFood(){return food;}

    public Double getCurrency(){return currency;}

    public int getLongsword(){return longsword;}

    public int getDagger(){return dagger;}

    public int getPocketKnife(){return pocketKnife;}
    
    public int getArmor(){return armor;}

    //set methods
    public void setHealth(Double hpt){health = hpt;}

    public void setStamina(Double std){stamina = std;}

    public void setFood(int fuk){food = fuk;}

    public void setCurrency(Double cun){currency = cun;}

    public void setLongsword(int lon){longsword = lon;}

    public void setDagger(int dik){dagger = dik;}

    public void setPocketKnife(int pen){pocketKnife = pen;}

    public void setArmor(int arm){armor = arm;}
    
    //behaviors
    //do damage; chance to miss
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
}
