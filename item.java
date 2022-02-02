public class item {
    private String name;
    private int cost;

    public item(String name, int cost){
        this.name = name; this.cost = cost;
    }

    //get and set shit
    public int getCost(){return cost;}
    public String getName(){return name;}

    public void setCost(int cst){cost = cst;}
    public void setName(String nam){name = nam;}

}
