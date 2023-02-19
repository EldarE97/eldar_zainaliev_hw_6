public class Main {
    public static void main(String[] args) {

        Boss villain = new Boss();
        villain.setHealth(800);
        villain.setDamage(60);
        System.out.println("Boss health: " + villain.getHealth() + ", damage: " + villain.getDamage() + ", weapon: " + villain.getWeapon());
        System.out.println();

        Weapon w = new Weapon();
        System.out.println(w.getFire());
    }
}