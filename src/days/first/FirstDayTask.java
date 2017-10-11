package days.first;


import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 10/10/2017.
 */
public class FirstDayTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite svori");
        int weight = sc.nextInt();
        System.out.println("Ivekite ugi");
        double height = sc.nextDouble();

        //double kmi = weight / (height* height);
        //double kmi = kmiMethod(weight, height);
        System.out.println("kmi " + kmiMethod(weight, height));
    }

    private static double kmiMethod(int weight, double height){
        return weight / (height * height);
    }
}
