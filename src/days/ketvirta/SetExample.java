package days.ketvirta;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by andriusbaltrunas on 10/13/2017.
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();// neturi aiskaus rikiavimo algoritmo
        Set<String> names2 = new LinkedHashSet<>();// kaip sudejom taip ir gausim atgal
        Set<String> names3 = new TreeSet<>();// rikiuoja nuo A iki Z arba muo 0 iki belekiek
        setItems(names);
        setItems(names2);
        setItems(names3);

        System.out.println("HasSet");
        print(names);
        System.out.println("LinkedHasSet");
        print(names2);
        System.out.println("TreeSet");
        print(names3);
    }

    private static void setItems(Set<String> names){
        names.add("Jonas");
        names.add("Andrius");
        names.add("Kazys");
        names.add("Nezinau");
        names.add("Andrius");
    }

    private static void print(Set<String> names){
        names.forEach(petras -> System.out.println(petras));
    }
}
