import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

 class FileReading {
 
    public static void main(String[] args) throws FileNotFoundException {
        java.util.Random rand = new Random();
        int counter = 0;
        String punchline[] = new String[370103];
        int number = rand.nextInt(370103);
        Scanner in = new Scanner(new File("words_alpha.txt"));
            while (in.hasNextLine()) {
                
            }
            System.out.print(in.nextLine() + " ");
         } // main
    } // class