package creatures;

public class Creature {
    protected String name;
    protected int health;
    protected int attackPower;

    public Creature(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Creature target) {
        System.out.println(name + " attacks " + target.name + " for " + attackPower + " damage!");
        target.takeDamage(attackPower);
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            health = 0;
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " now has " + health + " health.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }
}
