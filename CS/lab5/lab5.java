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

class two {
    public static void main(String args[]) throws IOException {
        int start = 0;
        int end = 0;

        System.out.print("input a start letter and an end letter:");
        start = System.in.read();

        end = System.in.read();

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            System.out.print((char) i + "\n");
        }

    } // main
} // class two

class three {
    public static void main(String[] args) throws IOException {
        int integer[] = new int[12];
        int sum = 0;

        System.out.print("Please enter two numbers separated by a space. Each number should be 6 or fewer digits");
        for (int i = 0; i < 12; i++) {
            integer[i] = System.in.read();
        }
    } // main
} // three