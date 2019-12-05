import java.io.*;
import java.util.Random;
import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {
        int height = 0;
        int i = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("what number do you want to start at?");
        height = in.nextInt();

        for (int j = height - 1; j > 0; j--) {
            for (i = j; i <= height; i++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }
}

class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int number = rand.nextInt(1001);
        int guess = 0;

        do {
            System.out.print("guess a number between 0 and 1000:");
            guess = in.nextInt();
            if (guess > number) {
                System.out.println("too high");
            } else if (guess < number) {
                System.out.println("too low");
            }
        } while (guess != number);
        System.out.println("you found the number!");
    } // main
} // class

class rectangle {
    public static void main(String[] args) {
        int height;
        int width;
        String box = "";
        Scanner in = new Scanner(System.in);

        System.out.print("input the height and width seperated by a space:");
        height = in.nextInt();
        width = in.nextInt();

        int w = width;
        int h = height;
        while (w > 0) {
            box += "*";
            w--;
        } // top
        System.out.println(box);

        box = "*";

        while (h > 2) {

            w = width;

            while (w > 2) {
                box += " ";
                w--;
            } // middle
            box += "*";
            System.out.println(box);
            box = "*";
            h--;
        } // height

        box = "";
        w = width;

        while (w > 0) {
            box += "*";
            w--;
        } // bottom
        System.out.println(box);

    } // main

} // class