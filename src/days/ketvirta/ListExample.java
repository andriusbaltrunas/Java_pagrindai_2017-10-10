package days.ketvirta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 10/13/2017.
 */
public class ListExample {

    public static void main(String[] args) {
        ArrayList<Integer> simpleArray = new ArrayList<>();
        List<Integer> listArray = new ArrayList<>();
        List<String> names = new LinkedList<>();

        listArray.add(12);
        listArray.add(1);

        names.add("Petras");
        names.add("Andrius");
        names.add(1, "Jonas");

        print(simpleArray);
        print(listArray);
        print(names);
        names.get(1);
    }

    private static <E> void print(List<E> list){
        //list.forEach(a -> System.out.println(a)); //nuo java 8
        System.out.println("ilgis " + list.size());
        for(E e:list){
            System.out.println(e);
        }
    }
}
