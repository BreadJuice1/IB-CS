import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

class joke {
    public static void main(String[] args) throws FileNotFoundException {
        // initialisation
        java.util.Random rand = new Random();
        int number = rand.nextInt(370103);
        int counter = 0;
        String puchline[] = new String[3];
        Scanner in = new Scanner(new File("words_alpha.txt"));
        Scanner inu = new Scanner(new File("words_alpha.txt"));
        // get the words
        while (counter < number && in.hasNextLine()) {
            if (counter == number - 1) {
                puchline[0] = in.nextLine();
            } else { // if
                in.nextLine();
            } // else
            counter++;
        } // while
        counter = 0;
        number = rand.nextInt(370103);
        while (counter < number && inu.hasNextLine()) {
            if (counter == number - 1) {
                puchline[1] = inu.nextLine();
            } else { // if
                inu.nextLine();
            } // else
            counter++;
        } // while
        System.out.println("knock knock. \nwhos there?");
        System.out.println(puchline[0] + ".");
        System.out.println(puchline[0] + " who?");
        System.out.print(puchline[0] + " " + puchline[1] + "!");
    } // main
} // class