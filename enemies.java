public class enemies {
    private int enemyhealth;
    private String enemyname;


    public enemies(int enemyhealth, String enemyname){
        enemyhealth = enemyhealth;
        enemyname = enemyname; 
    }

    //get and sets

    public int getEnemyHealth(){return enemyhealth;}

    public String getEnemyName(){return enemyname;}

    public void setEnemyHealth(int enemyhealth){enemyhealth = enemyhealth;}

    public void setEnemyName(String enemyname){enemyname = enemyname;}

}
