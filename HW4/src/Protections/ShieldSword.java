package Protections;
import Weapons.Bow;

import java.util.Random;

public class ShieldSword extends Protection {

    public ShieldSword(int pointOfProtect) {
        super(pointOfProtect);
    }

    public int getShield() {
        return pointOfProtect;
    }

    @Override
    public String toString() {

        return String.format(" = %d", pointOfProtect);
    }

    @Override
    public int protect() {
        return new Random().nextInt(0, pointOfProtect);
    }


}