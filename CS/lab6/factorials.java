import java.util.Scanner;

class factorials {
    public static void main(String[] args) {
        int sum = 1;
        int number;
        int counter;
        Scanner in = new Scanner(System.in);

        System.out.print("input a number:");
        number = in.nextInt();
        counter = 0;

        System.out.print(number + "! = ");
        for (int i = number; i > 0; i--) {
            System.out.print(i);
            sum = sum * i; 
                if (i != 1) {
                    System.out.print(" x ");
                } // if
        } // for
        System.out.print(" = " + sum);
    } // method
} // class