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


    //constructor

    public characterVariables(Double hp, Double st, int f, Double c, int l, int d, int p, int a){
        health = hp; stamina = st; food = f; currency = c; longsword = l; dagger = d; pocketKnife = p; armor = a;
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
    public void setHealth(Double hp){health = hp;}

    public void setStamina(Double st){stamina = st;}

    public void setFood(int f){food = f;}

    public void setCurrency(Double c){currency = c;}

    public void setLongsword(int l){longsword = l;}

    public void setDagger(int d){dagger = d;}

    public void setPocketKnife(int p){pocketKnife = p;}

    public void setArmor(int a){armor = a;}
    
    //behaviors


}
