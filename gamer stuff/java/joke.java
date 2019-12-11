import java.io.File;
import java.util.Random;
import java.util.Scanner;
 class FileReading {
 
    public static void main(String[] args) {
        java.util.Random rand = new Random();
        int counter = 0;
        String punchline;
        Scanner in = new Scanner(new File("words_alpha.txt"));
            while (in.hasNextLine()) {
                while (counter < rand.nextInt(466000)) {
                    in.nextLine();
                    counter++;
                }
                System.out.print(in.nextLine());
                counter = 0;
                while (counter < rand.nextInt(466000)) {
                    in.nextLine();
                    counter++;
                }
                System.out.print(in.nextLine());
            } // while
         } // main
    } // class