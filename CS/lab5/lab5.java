import java.io.*;
import java.util.*;

class charread {
    public static void main(String args[]) throws IOException {
        int charval = 0;
        char mychar;

        System.out.println("Please enter a character");

        charval = System.in.read();

        mychar = (char) charval;

        System.out.println("Letter value read was " + charval + " character is " + mychar);
    } // main
}// charread

class lab5 {
    public static void one(String args[]) throws IOException {
        int start = 0;
        int end = 0;
        System.out.print("input a start letter:");
        start = System.in.read();
        System.out.print("input an end letter:");
        end = System.in.read();

        for (int i = start; i <= end; i++) {
            System.out.println(i + (char) i);
        }
    } // problem1

    public static void main(String[] args) {
        Scanner prog = new Scanner(System.in);
        System.out.println("what program do you want to run?");
        int prognum = prog.nextInt();
        if (prognum == 1) { one(args); }
        else if (prognum == 2) { }

    }
} // class