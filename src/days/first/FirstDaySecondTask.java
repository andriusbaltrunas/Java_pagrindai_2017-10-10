package days.first;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 10/10/2017.
 */
public class FirstDaySecondTask {
   /*
    // pirmas variantas
    private static double km;
    private static double l;

    public static void main(String[] args) {
        readData();
        System.out.println(average());
    }

    private static void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite km");
        km = sc.nextDouble();
        System.out.println("Iveskite L");
        l = sc.nextDouble();
    }


    private static double average() {
        return (l * 100) / km;
    }*/

    public static void main(String[] args) {
        System.out.println(readData());
    }

   /* private static double readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesk km");
        double km = 0.0;
        double l = 0.0;
        try {
            km = scanner.nextDouble();
            System.out.println("Ivesk l");
            l = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("reikejo skaiciu");
            return 0.0;
        }
        return average(km, l);
    }*/
   private static double readData() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ivesk km");
       double km = getCorrectValue(scanner);
       System.out.println("Ivesk l");
       double l = getCorrectValue(scanner);
       return average(km, l);
   }

    private static double average(double km, double l) {
        return (l * 100) / km;
    }

    private static double getCorrectValue(Scanner scanner) {
        double response = 0.0;
        while (true) {
            try {
                response = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ivesta bloga reiksme, pakartok");
                scanner.nextLine();
            }
        }
        return response;
    }
}
