import java.util.Scanner;

class oddeven {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // get number
    System.out.print("input number: ");
    Double number = in.nextDouble();

    // math
    Boolean check = number % 2 == 0;
    if (check == true) {
        System.out.println(number +" is an even number");
    } else {
        System.out.println(number +" is an odd number");
    }
    in.close();
    } // main
} // class