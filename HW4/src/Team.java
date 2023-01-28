package hw4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <E extends hw4.Warrior> implements Iterable<E>{
    private List<E> team = new ArrayList<>();

    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if(item instanceof hw4.Archer) {
                if(((hw4.Archer)item).shotRange() > maxRange) maxRange = ((hw4.Archer)item).shotRange();
            }
        }
        return maxRange;
    }

    public int maxTeamProtect() {
        int maxProtect = 0;
        for (E item : team) {
            if(item instanceof hw4.Archer) {
                if(((hw4.Archer)item).shotRange() > maxProtect) maxProtect = ((hw4.Archer)item).shotRange();
            }
        }
        return maxProtect;
    }
}