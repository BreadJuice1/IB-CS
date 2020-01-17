import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class lab8 {
    public static void main(String[] args) throws FileNotFoundException {

        int gender[] = new int[88];
        int id[] = new int[88];
        String lastName[] = new String[88];
        String firstName[] = new String[88];
        int grades[] = new int[4]; // 0 = freshmen, 1 = sophomores, 2 = juniors, 3 = seniors

        fillgrades(grades);
        fillid(id);
    } // main

    public static void fillgrades(int[] grades) {
        Scanner in = new Scanner(new File("classlist.txt"));
        int next;
        while (in.hasNextLine()) {
            in.nextInt();
            next = in.nextInt();
            switch (next) {
            case 9:
                grades[0] += 1;
                break;
            case 10:
                grades[1] += 1;
                break;
            case 11:
                grades[2] += 1;
                break;
            case 12:
                grades[3] += 1;
                break;
            } // switch
            in.nextLine();
        } // hasnextline
        in.close();
    } // fillgender

    public static void fillid(int[] id) {
        Scanner in = new Scanner(new File("classlist.txt"));
    }
} // lab8