 import java.util.Scanner;

 class lab4 {
     public static void sigma() {
        Scanner in = new Scanner(System.in);
        System.out.print("input number:");
            int num = in.nextInt();
        in.close();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            if (i < num) {
            System.out.print(i +"+");
                } else {
                    System.out.print(i);
                }
            } // for
        System.out.print("=" +sum);
    } // sigma

    public static void grades() {
        Scanner grades = new Scanner(System.in);
        int grade = 0;
        int lastGrade = 0;
        int total = 0;
        int average = 0;
        int counter = 0;
        do {
            counter++;
            System.out.print("input grade:");
            grade = grades.nextInt();
            total = lastGrade + grade;
            lastGrade = grade;
            average = total/counter;
        } while (grade != -1); 
        System.out.print("the average is " +average);
        
        grades.close();
    } // grades
    public static void main(String[] args) {
        Scanner program = new Scanner(System.in);
        System.out.println("which problem do you want to run?");
        int prognum = program.nextInt();
        if (prognum == 0) {
            System.exit(0);
        } else if (prognum == 1) {
                sigma();
            } else if (prognum == 2) {
                    grades();
                }
    } // main
 } // class

