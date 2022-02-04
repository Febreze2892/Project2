public class weapons extends item{
    private int damage;
    //private int cost;
    private int staminaCost;
    private int durability;
    //private String name;

    public weapons(int dam, int cst, int stc, int dur, String nam){
        super(nam, cst);
        damage = dam; staminaCost = stc; durability = dur;
        
    }

    //get methods
    public int getDamage(){return damage;}

    

    public int getStaminaCost(){return staminaCost;}

    public int getDurability(){return durability;}

    

    //set methods
    public void setDamage(int dam){damage = dam;}
    


    public void setStaminaCost(int stc){staminaCost = stc;}

    public void setDurability(int dur){durability = dur;}

    

    //making a longsword, weapon(150, 50, 20, 100, "Baleigh's Longsword")
    //equipped to the character as in it's added to their arraylist
    //they can pick it since they'll know it's the longsword


}
