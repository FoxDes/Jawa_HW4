package hw4;

import Protections.ShieldSword;

public class Swordman extends hw4.Warrior {

    public Swordman(String name, int healthPoint, hw4.Weaponable sword, ShieldSword pointOfProtect) {
        super(name, healthPoint, sword, pointOfProtect);
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }

}
