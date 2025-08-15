package creatures;

public class Dragon extends Creature {
    private int firePower;

    public Dragon(String name, int health, int attackPower, int firePower) {
        super(name, health, attackPower);
        this.firePower = firePower;
    }

    @Override
    public void attack(Creature target) {
        // Uses both normal attack and fire
        System.out.println(name + " breathes fire at " + target.name + " for " + firePower + " extra damage!");
        target.takeDamage(attackPower + firePower);
    }

    public void roar() {
        System.out.println(name + " lets out a terrifying roar! All enemies tremble.");
    }
}
