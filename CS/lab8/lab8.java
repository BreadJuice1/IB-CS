import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class lab8 {
    public static void printarrayint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    } // printarrayint
    public static void main(String[] args) throws FileNotFoundException { // main

        int gender[] = new int[2]; // 0 = male, 1 = female
        int id[] = new int[88];
        String lastName[] = new String[88];
        String firstName[] = new String[88];
        int grades[] = new int[4]; // 0 = freshmen, 1 = sophomores, 2 = juniors, 3 = seniors

        fillgrades(grades);
        fillid(id);
        fillgender(gender);
        filllastname(lastName);
        fillfirstnames(firstName);
        
        printarrayint(gender);
    } // main

    public static void fillgrades(int[] grades) throws FileNotFoundException {
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

    public static void fillid(int[] id) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classlist.txt"));
        int i = 0;
        while (in.hasNextLine()) {
            id[i] = in.nextInt();
            i++;
            in.nextLine();
        }
    } // fill id

    public static void fillgender(int[] gender) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classlist.txt"));

        while (in.hasNextLine()) {
            String genderstr = in.nextLine();
            if (genderstr.toLowerCase().contains("male"));
                gender[0] += 1;
            if (genderstr.toLowerCase().contains("female"));
                gender[1] += 1;
            in.nextLine();
        }
    } // fillgender

    public static void filllastname(String[] names) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classlist.txt"));
        int i = 0;
        while (in.hasNextLine()) {
            in.next();
            in.next();
            in.next();
            names[i] = in.next();
            i++;
            in.nextLine();
        }
    } // filllastnames

    public static void fillfirstnames(String[] names) throws FileNotFoundException {
        Scanner in = new Scanner(new File("classlist.txt"));
        int i = 0;
        while (in.hasNextLine()) {
            in.next();
            in.next();
            names[i] = in.next();
            i++;
            in.nextLine();
        }
    } // fillfirstnames
} // lab8