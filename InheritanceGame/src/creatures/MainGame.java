package creatures;

public class MainGame {
    public static void main(String[] args) {
        Dragon smaug = new Dragon("Smaug", 150, 20, 30);
        Phoenix fawkes = new Phoenix("Fawkes", 100, 15);

        System.out.println("=== Creature Stats ===");
        smaug.displayInfo();
        System.out.println();
        fawkes.displayInfo();
        System.out.println();

        System.out.println("=== Battle Start ===");
        smaug.roar();
        smaug.attack(fawkes);
        fawkes.attack(smaug);

        // Phoenix takes enough hits to trigger revival
        smaug.attack(fawkes);
        smaug.attack(fawkes);

        System.out.println();
        System.out.println("=== Final Stats ===");
        smaug.displayInfo();
        System.out.println();
        fawkes.displayInfo();
    }
}
