import java.util.*;

class circ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Double circ;
        System.out.print("Input the radius:");
        Double radius = in.nextDouble();
        in.close();

        circ = ((2) * (3.14159) * (radius));
        System.out.print("the circumference is " + circ);

    }
}