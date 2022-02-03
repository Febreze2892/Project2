public class foods extends item{
    private int heals;
    private int givestamina;

    public foods(String name, int cost, int heals, int givestamina) {
        super(name, cost);
        heals = heals;
        givestamina = givestamina;
        //TODO Auto-generated con   structor stub
    }

    public int getHeals(){return heals;}
    public void setHeals(int heals){heals = heals;}

    public int getStamina(){return givestamina;}
    public void setStamina(int givestamina){givestamina = givestamina;}


    
}
