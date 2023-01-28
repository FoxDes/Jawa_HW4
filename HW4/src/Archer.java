package hw4;

import Protections.ShieldArcher;
import Weapons.Bow;

public class Archer extends hw4.Warrior {


    public Archer(String name, int healthPoint, Bow bow, ShieldArcher pointOfProtect) {
        super(name, healthPoint, (hw4.Weaponable) bow, pointOfProtect);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }

}