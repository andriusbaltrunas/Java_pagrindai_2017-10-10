package days.third;

import javax.sql.rowset.spi.SyncResolver;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 10/12/2017.
 */
public class HiLowExample {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        int maxVal = printMenu(scanner);

        Random random = new Random();
        int randomGeneratedNumber = random.nextInt(maxVal);

        System.out.println("Spejimu skaicius " + playGame(scanner, randomGeneratedNumber, maxVal));
    }

    private static int playGame(Scanner sc, int randomNumb, int maxVal){
        int guess = 1;
        while (true) {
            if(maxVal == 1000 && guess == 10){
                System.out.println("Per daug spejimu");
                break;
            }
            try {
                System.out.println("Spekite skaiciu");
                int spejimas = sc.nextInt();
                if (spejimas == randomNumb) {
                    System.out.println("Atspejai");
                    break;
                } else {
                    hiLow(spejimas, randomNumb);
                    guess++;
                }
            }catch (InputMismatchException e){
                System.out.println("Blogas skaicius");
                sc.nextLine();
            }
        }
        return guess;
    }

    private static void hiLow(int spejimas, int randomNumber){
        if(spejimas > randomNumber){
            System.out.println("per didelis");
        }else {
            System.out.println("per mazas");
        }
    }

    private static int printMenu(Scanner sc){
        int temp = 0;
        boolean runUntil = true;
        while (runUntil) {
            System.out.println("Pasitinkite sunkumo lygi\n 1. nuo 1 iki 10\n 2. nuo 1 iki 100\n 3. nuo 1 iki 1000");
            try {
                int selection = sc.nextInt();
                switch (selection) {
                    case 1:
                        temp = 10;
                        runUntil = false;
                        break;
                    case 2:
                        temp = 100;
                        runUntil = false;
                        break;
                    case 3:
                        temp = 1000;
                        runUntil = false;
                        break;
                    default:
                        System.out.println("Nera tokio meniu punkto");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Blogas formatas, pakartokite ivedima");
                sc.nextLine();
            }
        }
        return  temp;
    }

}
