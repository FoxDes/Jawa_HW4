package hw4;

import Protections.ShieldArcher;
import Protections.ShieldSword;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private hw4.Weaponable weapon;
    private hw4.Protection protection;

    public Warrior(String name, int healthPoint, hw4.Weaponable weapon, Protections.Protection protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public hw4.Weaponable getWeapon() {
        return weapon;
    }
    public Protections.ShieldSword getShield() {
        return (ShieldSword) protection;
    }
    public hw4.Protection getProtect() {
        return (hw4.Protection) protection;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + ", shield = " + protection +"]";
    }
}
