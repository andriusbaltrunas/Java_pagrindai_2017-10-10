package days.second;


import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 10/11/2017.
 */
public class MainCalculator {

    /*
    * 12 * 12 {"12", "*", "12"}   12-223
    * 20 - 13
    * 23 + 34
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskit du skaicius ir operacija pvz x + y");
        String insertVal = scanner.nextLine();
        String[] split = insertVal.split(" ");
        if (split.length == 3) {
            Calculator calculator = new Calculator();
            try {
                int numb = Integer.valueOf(split[0]);
                int numbSec = Integer.valueOf(split[2]);
                int result = 0;
                switch (split[1]) {
                    case "+":
                        result = calculator.suma(numb, numbSec);
                        break;
                    case "-":
                        result = calculator.skirtumas(numb, numbSec);
                        break;
                    case "*":
                        result = calculator.sandauga(numb, numbSec);
                        break;
                    default:
                        System.out.println("Nera tokios operacijos");
                        break;
                }
                System.out.println("Resultatas ->>" + result);
            }catch (NumberFormatException e){
                System.out.println("blogai ivestas formatas");
            }
        } else {
            System.out.println("Paleisk programa is naujo");
        }
    }
}
