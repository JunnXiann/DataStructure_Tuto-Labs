package Lab.Revision.Q2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String tempArr[];
        try {
            Scanner sc = new Scanner(new FileReader("Lab/Revision/Q2/test1.txt"));
            while(sc.hasNextLine()) {
                tempArr = sc.nextLine().split(",");
                for (String str:tempArr) {
                    System.out.print(str);
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // test4
    }
}
