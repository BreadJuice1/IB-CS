import java.util.Scanner; import java.lang.Math;

class lab3 {
    public static void main(String[] args) {

    Scanner nums = new Scanner(System.in);

    System.out.print("input program:");
    int programNum = 0;

    do {
        // check program
        programNum = nums.nextInt();
        if (programNum == 1) {

            // get a, b, and c
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
    
            if (Double.isNaN(x1) || Double.isNaN(x2))
            {
                System.out.println("x is an imaginary number");
            } else System.out.println("The values are: " + x1 + ", " + x2);
        }
    } while (programNum == 0);

    } // main
} // class