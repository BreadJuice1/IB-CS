import java.util.Scanner;

class bmi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // get data
        System.out.println("input height:");
        Double height = in.nextDouble();
        System.out.println("input weight:");
        Double weight = in.nextDouble();

        // math
        Double height_squared = height * height;
        Double bmi = (weight * 703) / (height_squared);

        if (bmi <= 18.5) {
            System.out.println("your bmi is " + bmi);
            System.out.println("you are underweight");
        } else if (18.5 < bmi && bmi < 25) {
            System.out.println("your bmi is " + bmi);
            System.out.println("you are normal");
        } else if (25 < bmi && bmi < 30) {
            System.out.println("your bmi is " + bmi);
            System.out.println("you are overweight");
        } else {
            System.out.println("your bmi is " + bmi);
            System.out.println("you are obese");
        }
        in.close();
    } // main

} // class