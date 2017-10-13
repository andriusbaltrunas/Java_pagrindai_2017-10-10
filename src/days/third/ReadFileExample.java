package days.third;

import java.io.*;

/**
 * Created by andriusbaltrunas on 10/12/2017.
 */
public class ReadFileExample {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("testData.txt")));
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }

            //test commit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
