import java.util.InputMismatchException;
import java.util.Scanner;

import java.lang.Math;

class lab3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int programNum = -1;

        do {
            // check program
            try {
                System.out.println("number | program");
                System.out.println("-------|-------------------");
                System.out.println("   1   | quadratic formula");
                System.out.println("   2   | pythagorean therom");
                System.out.println("   0   | exit");
                System.out.print("input program:");
                programNum = in.nextInt();
                if (programNum != 0 && programNum != 1 && programNum != 2) {
                    System.out.println("number | program");
                    System.out.println("-------|-------------------");
                    System.out.println("   1   | quadratic formula");
                    System.out.println("   2   | pythagorean therom");
                    System.out.println("   0   | exit");

                    programNum = -1;
                }

                if (programNum == 1) {

                    // get a, b, and c
                    Scanner nums = new Scanner(System.in);
                    System.out.print("input a:");
                    Double a = nums.nextDouble();
                    System.out.print("input b:");
                    Double b = nums.nextDouble();
                    System.out.print("input c:");
                    Double c = nums.nextDouble();
                    nums.close();

                    // math
                    double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                    double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                    if (Double.isNaN(x1) || Double.isNaN(x2)) {
                        System.out.println("x is an imaginary number");
                    } else
                        System.out.println("The values are: " + x1 + ", " + x2);
                    break;
                } // program 1

                if (programNum == 2) {
                    Double cSquared = 0.0;

                    // get vars
                    Scanner nums = new Scanner(System.in);
                    System.out.println("input each side length (use -1 to show the unknown)");
                    Double a = nums.nextDouble();
                    Double b = nums.nextDouble();
                    Double c = nums.nextDouble();
                    nums.close();

                    // math
                    if (c == -1) {
                        cSquared = (a * a) + (b * b);
                        c = Math.sqrt(cSquared);
                        System.out.println("the unknown is " + c);
                    } // c
                    if (a == -1) {
                        cSquared = (b * b) + (c * c);
                        a = Math.sqrt(cSquared);
                        System.out.println("the unknown is " + a);
                    } // a
                    if (b == -1) {
                        cSquared = (a * a) + (c * c);
                        c = Math.sqrt(cSquared);
                        System.out.println("the unknown is " + b);
                    }

                } // program 2

                if (programNum == 0) {
                    System.exit(0);
                } // program 3
            } catch (Exception e) {
                System.out.print("please input a number.");
            }
        } while (programNum != 0);
        in.close();
    } // main
} // class