import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {
        int height;
        int width;
        String box = "";
        Scanner in = new Scanner(System.in);

        System.out.print("input the height and width seperated by a space:");
        height = in.nextInt();
        width = in.nextInt();

        int w = width;
        int h = height;
        while (w > 0) {
            box += "*";
            w--;
        } // top
        System.out.println(box);

        box = "*";

        while (h > 2) {

            w = width;

            while (w > 2) {
                box += " ";
                w--;
            } // middle
            box += "*";
            System.out.println(box);
            box = "*";
            h--;
        } // height

        box = "";
        w = width;

        while (w > 0) {
            box += "*";
            w--;
        } // bottom
        System.out.println(box);

    } // main

} // class