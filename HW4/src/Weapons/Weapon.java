package Weapons;
import hw4.Weaponable;

public abstract class Weapon implements hw4.Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }
}
