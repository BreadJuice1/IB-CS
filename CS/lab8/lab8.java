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
        fillgender(gender);
        filllastname(lastName);
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
        int i = 0;
        while (in.hasNextLine()) {
            id[i] = in.nextInt();
            i++;
            in.nextLine();
        }
    } // fill id

    public static int fillgender(int[] gender) {
        Scanner in = new Scanner(new File("classlist.txt"));
        
        while (in.hasNextLine()) {
            in.next();
            in.next();
            String genderstr = in.next();
            if (genderstr == "Male") gender[0] += 1;
            if (genderstr == "Female") gender[1] += 1;
            in.nextLine();
        }
        return 0;
    } // fillgender

    public static String filllastname(String[] names) {
        return null;
    } // filllastnames
} // lab8