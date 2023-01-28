package hw4;
import Protections.Protection;
import Protections.ShieldArcher;
import Protections.ShieldSword;
import Weapons.Bow;
import Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        hw4.Team<hw4.Swordman> team1 = new hw4.Team<>();
        team1.addWarriorToTeam(new hw4.Swordman("Vasya", 250, new Sword(25), new ShieldSword(300)))
                .addWarriorToTeam(new hw4.Swordman("John", 200, new Sword(50), new ShieldSword(300)));

        for (hw4.Swordman swordman : team1) {
            System.out.println(swordman);
        }

        hw4.Team<hw4.Archer> team2 = new hw4.Team<>();
        team2.addWarriorToTeam(new hw4.Archer("Kolya", 150, new Bow(100, 50), new ShieldArcher(150)))
                .addWarriorToTeam(new hw4.Archer("Paul", 200, new Bow(75, 70), new ShieldArcher(150)));

        for (hw4.Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
    }
}
