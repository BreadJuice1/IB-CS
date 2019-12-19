import java.util.Scanner;

class factorials {

    public static void main(String[] args) {
        long sum = 1;
        int number;
        int counter;
        Scanner in = new Scanner(System.in);

        System.out.print("input a number:");
        number = in.nextInt();
        counter = 0;

        for (int j = number; j > 0; j--) {
            for (int i = j; i > 0; i--) {
                System.out.print(i);
                sum = sum * i;
                if (i == j) {
                    System.out.print("! = " + i);
                }
                if (i != 1) {
                    System.out.print(" x ");
                } // if
            } // i
            System.out.println(" = " + sum);
            sum = 1;
        } // j
    } // method
} // class