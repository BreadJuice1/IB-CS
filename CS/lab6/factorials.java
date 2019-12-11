import java.util.Scanner;

class factorials {
    public static void main(String[] args) {
        String answer = "";
        int sum = 1;
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("input a number:");
        number = in.nextInt();

        answer = "1! = ";
        for (int i = 1; i <= number; i++) {
            answer += sum * i;
        }
        
        System.out.print(answer);
    } // method
} // class