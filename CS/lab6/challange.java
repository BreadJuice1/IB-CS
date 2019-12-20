import java.util.Scanner;
import java.io.*;

class challange {
    public static void challange() {
        // init
        Scanner in = new Scanner(System.in);
        int answer;
        int number[] = new int[2];
        Boolean found = false;

        // user input
        System.out.println("which prime do you want to find?");
        number[0] = in.nextInt();

        // calculate prime
        int counter = 1;
        while (found = false) {
            if (number[0] % counter == 0 && counter != number[0] && counter != 1) {
                found = true;
                number[1] = 1;
            } else if (counter)
            counter++; 
        }
        

    } // challange method
    public static void main(String[] args) {
         challange();
    } // main

} // class