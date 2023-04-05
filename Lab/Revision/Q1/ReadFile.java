package Lab.Revision.Q1;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileReader("Lab/Revision/Q1/JunXian_22052697.txt"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            System.out.println("Add your second part here: ");
            Scanner scan = new Scanner(System.in);
            try {
                FileWriter fw = new FileWriter("Lab/Revision/Q1/JunXian_22052697.txt", true);
                fw.write("\n\n");
                fw.write(scan.nextLine());
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
