public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 20, "Teleport");
        heroes[1] = new Medic(120, 10, "Healing Touch", 50);
        heroes[2] = new Warrior(150, 30, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}

