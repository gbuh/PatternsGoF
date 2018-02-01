package behavioral.Strategy.Game;

public class WeaponNoWay implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Character " + this.toString());
    }

    @Override
    public String toString() {
        return "no way weapon";
    }
}
