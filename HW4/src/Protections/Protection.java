package Protections;

public abstract class Protection implements hw4.Protection {

    protected int pointOfProtect;

    public Protection(int pointOfProtect) {
        this.pointOfProtect = pointOfProtect;
    }
}
