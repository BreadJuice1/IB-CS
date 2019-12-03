import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {
        int height = 0;
        int i = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("what number do you want to start at?");
        height = in.nextInt();

        for (int j = height - 1; j > 0; j--) {
            for (i = j; i <= height; i++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }
}