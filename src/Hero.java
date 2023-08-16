public class Hero {

    private int health;
    private int damage;
    private String ability;

    public Hero( int theHealth, int theDamage, String theAbility){
        health = theHealth;
        damage = theDamage;
        ability = theAbility;
    };

    public Hero( int theHealth, int theDamage){
        health = theHealth;
        damage = theDamage;
    };


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getAbility() {
        return ability;
    }
}
