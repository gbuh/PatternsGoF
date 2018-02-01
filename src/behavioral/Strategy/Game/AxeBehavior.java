package behavioral.Strategy.Game;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Character get a " + this.toString());
    }

    @Override
    public String toString() {
        return "Axe";
    }
}
