package days.first;

/**
 * Created by andriusbaltrunas on 10/10/2017.
 */
public class PirmasPvz {
    private int value;
    private int secondValue;

    public static void main(String[] args){
        PirmasPvz pirmasPvz = new PirmasPvz();
        pirmasPvz.value = 12;
        pirmasPvz.secondValue = 30;
        System.out.println(pirmasPvz.sum());// isvedimas i console
        pirmasPvz.testPrivate();// statinis kviecia nestatini per objekto varda
    }

    public int sum(){
        test();
        testPrivate();//tiesiogiai galima
        return value + secondValue;
    }

    public int test(){
        sum(); //negalima
        return 0;
    }

    private void testPrivate(){
        System.out.println("Testas");
    }
}
