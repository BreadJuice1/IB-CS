import java.util.Scanner;

class grades {
   public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    // get grades
    System.out.print("input total points: ");
    Double total_points = in.nextDouble();
    System.out.print("input score: ");
    Double score = in.nextDouble();

    // check numbers
    if (total_points < 0 || score < 0) {
        System.out.print("please enter a positive number");
        System.exit(0);
    }

    // calculate
    Double  percent_score = (score / total_points) * 100;

    // return grades
    if (percent_score >= 90) {
        System.out.print("A, " +percent_score +"%");
    } else if (90 > percent_score && percent_score >= 80) {
            System.out.print("B, " +percent_score +"%"); 
        } else if (80 > percent_score && percent_score >= 70) {
                System.out.print("C, " +percent_score +"%");
            } else if (70 > percent_score && percent_score >= 60) {
                    System.out.print("D, " +percent_score +"%");
                } else if (60 > percent_score && percent_score >= 0) {
                        System.out.print("F, " +percent_score +"%");
                    }

                    in.close();
    } // main
} // class