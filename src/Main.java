public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 20, "");
        heroes[1] = new Medic(120, 10, "");
        heroes[2] = new Warrior(150, 30,"" );

        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}
