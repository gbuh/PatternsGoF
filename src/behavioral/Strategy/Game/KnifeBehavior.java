package behavioral.Strategy.Game;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Character get a " + this.toString());
    }

    @Override
    public String toString() {
        return "Knife";
    }
}
