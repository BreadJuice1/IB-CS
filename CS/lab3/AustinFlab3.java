import java.util.Scanner;
import java.lang.Math;

class lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run_again = true;
        int user_input = 0;

        while (run_again == true) {

            // check program
            System.out.println("number | program");
            System.out.println("-------|-------------------");
            System.out.println("   1   | quadratic formula");
            System.out.println("   2   | pythagorean therom");
            System.out.println("  -1   | exit");
            System.out.print("input program:");
            user_input = in.nextInt();

            if (user_input == 1) {

                // get a, b, and c
                System.out.print("input a:");
                Double a = in.nextDouble();
                System.out.print("input b:");
                Double b = in.nextDouble();
                System.out.print("input c:");
                Double c = in.nextDouble();
                in.close();

                // math
                double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                if (Double.isNaN(x1) || Double.isNaN(x2)) {
                    System.out.println("x is an imaginary number");
                } else
                    System.out.println("The values are: " + x1 + ", " + x2);
            } // program 1

            if (user_input == 2) {
                Double cSquared = 0.0;

                // get vars
                System.out.println("input each side length (use -1 to show the unknown)");
                Double a = in.nextDouble();
                Double b = in.nextDouble();
                Double c = in.nextDouble();
                in.close();

                // math
                if (a == -1) {
                    cSquared = (c * c) - (b * b);
                    a = Math.sqrt(cSquared);
                    System.out.println("the unknown is " + a);
                } // a
                if (b == -1) {
                    cSquared = (c * c) - (a * a);
                    b = Math.sqrt(cSquared);
                    System.out.println("the unknown is " + b);
                } // b
                if (c == -1) {
                    cSquared = (a * a) + (b * b);
                    c = Math.sqrt(cSquared);
                    System.out.println("the unknown is " + c);
                } // c

            } // program 2
            else {
                run_again = false;
            }
        } // menu
    } // main
} // class