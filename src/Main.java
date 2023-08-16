public class Main {
    public static void main(String[] args) {
        Boss gameBoss = new Boss();
        gameBoss.setHealth(800);
        gameBoss.setDamage(100);
        gameBoss.setDefenseType("Telepat");

        System.out.println("HEALTH: " + gameBoss.getHealth() + " DAMAGE: " + gameBoss.getDamage()
                + " DEFENSE TYPE: " + gameBoss.getDefenseType());
        createHeroes();
        for (Hero hero : createHeroes()) {
            System.out.println("HEALTH: " + hero.getHealth() + " DAMAGE: " + hero.getDamage()
                    + " ABILITY: " + hero.getAbility());
        }

    }


    public static Hero[] createHeroes() {
        Hero[] myHeroes = new Hero[3];
        Hero magical = new Hero(500, 250, "Magical");
        Hero kinetic = new Hero(450, 270, "Kinetic");
        Hero general = new Hero(480, 200, "General");
        myHeroes[0] = magical;
        myHeroes[1] = kinetic;
        myHeroes[2] = general;
        return myHeroes;

    }
}

