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
        startchar = (char) start;

        end = System.in.read();
        endchar = (char) end;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            System.out.print((char) i + "\n");
        }

    } // main
} // class two

class three {
    public static void main(String[] args) {
        int integer[] = new int[6];

        System.out.print("input an up to six digit number:");
        for (i = 0; i <= 6; i++) {
            integer[i] = System.in.read();
        }
    }
}