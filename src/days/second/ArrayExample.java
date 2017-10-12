package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 10/11/2017.
 */
public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ivesk masyvo ilgi");
        int masL = getGoodNumber(scanner);
        int[] mas = new int[masL];
        for(int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " +i+" skaiciu");
            mas[i] = getGoodNumber(scanner);
        }
        printMas(mas);
        System.out.println();
        reverse(mas);
    }



    //[12,2,3,5,1] -> [1,5,3,2,12]
    private static void reverse(int[] mas){
        int[] temp = new int[mas.length];
        int j = mas.length -1 ;
        for (int i = 0; i < mas.length; i++){
            temp[i]= mas[j-i];
        }
        printMas(temp);
    }

    private static void printMas(int[] mas){
        for(int i =0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }

    private static int getGoodNumber(Scanner sc) {
        int i = 0;
        while (true) {
            try {
                i = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Juk sakiau skaicius, pakartok" );
                sc.nextLine();
            }
        }
        return i;
    }
}
