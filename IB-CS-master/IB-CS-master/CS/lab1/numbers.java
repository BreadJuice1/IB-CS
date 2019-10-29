import java.io.*;
import java.util.Scanner;

class numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input two numbers:");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        in.close();

        // difference
        if (num1 > num2) {
            System.out.print("difference:");
            System.out.println(num1 - num2);
        } else if (num1 < num2) {
            System.out.print("difference:");
            System.out.println(num2 - num1);
        }

        // sum
        System.out.print("sum:");
        System.out.println(num1 + num2);

        // product
        System.out.print("product:");
        System.out.println(num1 * num2);

        // quotient
        if (num1 > num2) {
            System.out.print("quotient:");
            System.out.println(num1 / num2);
        } else if (num1 < num2) {
            System.out.print("quotient:");
            System.out.println(num2 / num1);
        }

    }
}