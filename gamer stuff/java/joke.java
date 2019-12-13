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
        String puchline[] = new String[2];
        Scanner in = new Scanner(new File("words_alpha.txt"));
        Scanner in2 = new Scanner(new File("words_alpha.txt"));
        Scanner user = new Scanner(System.in);
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
        while (counter < number && in2.hasNextLine()) {
            if (counter == number - 1) {
                puchline[1] = in2.nextLine();
            } else { // if
                in2.nextLine();
            } // else
        } // while
        System.out.print(puchline[0] + " ");
        System.out.print(puchline[1]);
    } // main
} // class