package behavioral.Strategy.Game;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new WeaponNoWay();
    }

    public Queen(String name) {
        this.name = name;
        weaponBehavior = new WeaponNoWay();
    }

    public Queen(String name, WeaponBehavior weaponBehavior) {
        this.name = name;
        this.weaponBehavior = weaponBehavior;
    }

    @Override
    public void fight() {
        if(weaponBehavior instanceof WeaponNoWay) {
            System.out.println(name + " not fighting");
        } else System.out.println(name + " bad fighting with " + weaponBehavior);
    }
}