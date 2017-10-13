package days.ketvirta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by andriusbaltrunas on 10/13/2017.
 */
public class Koduote {

    private static final String SPACE = "32";

    public static void main(String[] args) {
        Map<String, String> codeMap = readFile();
        List<String> mailCodes = getMailCode();

        mailCodes.forEach(code -> {
            String temp = codeMap.get(code);
            if(temp != null){
                System.out.print(temp);
            }
        });

    }

    private static List<String> getMailCode(){
        List<String> mailCodes = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("laiskas.txt")));
            String line;
            while ((line = bf.readLine())!= null){
                String[] items = line.split(" ");
                mailCodes.addAll(Arrays.asList(items));
            }
        }catch (IOException e){
            System.out.println("Cant read files");
        }

        return mailCodes;
    }

    private static Map<String, String> readFile(){
        Map<String, String> codeMap = new TreeMap<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("koduote.txt")));
            String line;
            while ((line = bf.readLine()) != null){
                String[] items = line.split(" ");
                if (items.length == 2){
                    codeMap.put(items[0], items[1]);
                }
            }
            codeMap.put(SPACE, " ");
        }catch (IOException e){
            System.out.println("Cant read file");
        }
        return codeMap;
    }
}
