import java.util.Scanner;

class intsep {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // get number
        do {
            System.out.print("input a 5 digit number:");
            int number = in.nextInt();

            // seperate digits and print
            for (int i = 1; i <= 5; i++) {
                System.out.print((number / (1 * 10 ^ i) % 10) + "   ");
            }

        } while (true);
    } // main
} // class