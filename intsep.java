import java.util.*;

class intsep {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // get number

        System.out.print("\n input a 5 digit number:");
        int number = in.nextInt();
        in.close();

        // seperate digits and print
        for (int i = 4; i <= 4; i--) {
            System.out.print((number / Math.pow(10, i) %10));
            System.out.print("   ");
        }

    } // main
} // class