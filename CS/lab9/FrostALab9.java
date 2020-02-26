
import java.util.Scanner;

class FrostALab9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int program;
        
        System.out.println(" sum | 1 \n tables | 2 \n fibonacci sequence | 3 \n interest rate | 4 \n pattern | 5 \n yet more pics | 6 \n pot shots at pi | 7 \n ");
        program = in.nextInt();

        switch (program) {
            case 1:
                sum();
                main(args);
            case 2: 
                tables();
                main(args);
         /*   case 3:
                fibseq();
                main(args);
            case 4:
                interest();
                main(args);
            case 5:
                main(args);
            case 6:
                pics();
                main(args);
            case 7:
                potshots();
                main(args); */
            default:
                break;
        }
    }

    public static void sum() {
        long sum = 0; 
        for (int i = 0; i <= 70000; i++) {
            sum += i;
        }
    System.out.println("the sum is " + sum);
    }

    public static void tables() {
        Scanner tables = new Scanner(System.in);
        int width;
        int [] rows;
        int [] columns;
        int height;
        System.out.print(" \n input the table dimensions: ");
        height = tables.nextInt();
        width = tables.nextInt();
        rows = new Int(width);

    }
}