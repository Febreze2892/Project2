public class weapons {
    private int damage;
    private int cost;
    private int staminaCost;
    private int durability;
    private String name;

    public weapons(int dam, int cst, int stc, int dur, String nam){
        damage = dam; cost = cst; staminaCost = stc; durability = dur; name = nam;
    }

    //get methods
    public int getDamage(){return damage;}

    public int getCost(){return cost;}

    public int getStaminaCost(){return staminaCost;}

    public int getDurability(){return durability;}

    public String getName(){return name;}

    //set methods
    public void setDamage(int dam){damage = dam;}

    public void setCost(int cst){cost = cst;}

    public void setStaminaCost(int stc){staminaCost = stc;}

    public void setDurability(int dur){durability = dur;}

    public void setName(String nam){name = nam;}

    //making a longsword, weapon(150, 50, 20, 100, "Baleigh's Longsword")
    //equipped to the character as in it's added to their arraylist
    //they can pick it since they'll know it's the longsword


}
