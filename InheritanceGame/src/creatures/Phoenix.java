package creatures;

public class Phoenix extends Creature {
    private boolean hasRevived;

    public Phoenix(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.hasRevived = false;
    }

    @Override
    public void takeDamage(int amount) {
        super.takeDamage(amount);
        if (health == 0 && !hasRevived) {
            revive();
        }
    }

    private void revive() {
        hasRevived = true;
        health = 50; // revival health
        System.out.println(name + " rises from the ashes with " + health + " health!");
    }
}
