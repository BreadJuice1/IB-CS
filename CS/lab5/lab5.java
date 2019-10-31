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
    public static void main(String args[]) throws IOException {
        int start = 0;
        int end = 0;
        System.out.print("input a start letter:");
        start = System.in.read();
        System.out.print("input an end letter:");
        end = System.in.read();

        for (int i = start; i <= end; i++) {
            char letter = (char) i;
            System.out.println(letter + i);
        }
    } // main
} // class