public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbilityType() {
        return superAbility;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbility = superAbilityType;
    }

    // Реализация метода из интерфейса HavingSuperAbility
    @Override
    public void applySuperAbility() {
        System.out.println("Hero is using " + superAbility);
    }
}
