import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

class joke2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String punchline[] = new String[2];
        String filename;
        
        System.out.print("what is the source file?");
        filename = in.next();

        punchline[0] = getpunchline(filename);
        punchline[1] = getpunchline(filename);

        System.out.println("knock knock. \nwhos there?");
        System.out.println(punchline[0] + ".");
        System.out.println(punchline[0] + " who?");
        System.out.print(punchline[0] + " " + punchline[1] + "!");
    } // main

    public static String getpunchline(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        java.util.Random rand = new Random();
        int number = rand.nextInt(getfilelength(filename));

        for (int i = 0; i < number; i++) {
            in.nextLine();
        }

        return in.nextLine();
    } // getpunchline

    public static int getfilelength(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        int length = 0;

        while (in.hasNextLine()) {
            length++;
            in.nextLine();
        }

        return length;
    } // getfilelength
} // class