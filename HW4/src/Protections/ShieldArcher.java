package Protections;

import java.util.Random;

public class ShieldArcher extends Protection {

    public ShieldArcher(int pointOfProtect) {
        super(pointOfProtect);
    }

    @Override
    public String toString() {

        return String.format(" = %d", pointOfProtect);
    }

    @Override
    public int protect() {
        return new Random().nextInt(0, pointOfProtect);
    }

//    private int protect;
//
//    public ShieldArcher(int pointOfProtect, int protect) {
//        super(pointOfProtect);
//        this.protect = protect;
//    }
//
//    @Override
//    public int protect() {
//        return new Random().nextInt(0, pointOfProtect);
//    }
//
//    @Override
//    public String toString() {
//        return "Shield protect = " + pointOfProtect;
//    }
}
