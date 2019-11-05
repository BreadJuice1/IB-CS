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
        char startchar;
        int end = 0;
        char endchar;

        System.out.print("input a start letter:");
        start = System.in.read();
        startchar = (char) start;
        System.out.println(startchar);

        System.out.print("input an end letter:");
        end = System.in.read();
        endchar = (char) end;
        System.out.println(endchar);

    } // main
} // class two