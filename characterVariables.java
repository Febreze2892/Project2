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


}
