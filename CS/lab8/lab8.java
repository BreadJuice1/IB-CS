import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classlist.txt"));
        int burh;
        String bruh;
        while (in.hasNextLine()) {
            bruh = in.nextLine();
            burh = Integer.parseInt(bruh);
        }
    }
}