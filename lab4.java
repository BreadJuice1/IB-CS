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
        int average = 0;
        int counter = 0;
        String averageGrade = "bruh";
        int amountA = 0;
        int amountB = 0;
        int amountC = 0;
        int amountD = 0;
        int amountF = 0;
    
        do {
            System.out.print("input grade:");
          
            grade = grades.nextInt();
            
            if (grade != -1) {
            average = (average * counter + grade) / (counter + 1);
            
            if (grade >= 90) {
                amountA++;
            } else if (grade >= 80 || grade < 90) {
                amountB++;
            } else if (grade >= 70 || grade < 80) {
                amountC++;
            } else if (grade >= 60 || grade < 70) {
                amountD++;
            } else {
                amountF++;
            }
        }
            counter++;

        } while (grade != -1); 
        
        if (average >= 90) { 
        averageGrade = "A";
        } else if (average >= 80 || average < 90) {
        averageGrade = "B";
        } else if (average >= 70 || average < 80) {
        averageGrade = "C";
        } else if (average >= 60 || average < 70) {
        averageGrade = "D";
        } else {
        averageGrade = "F";
        }

        System.out.println("the average is " +averageGrade);
        System.out.println(amountA +" studnets got an A");
        System.out.println(amountB +" students got a B");
        System.out.println(amountC +" students got a C");
        System.out.println(amountD +" students got a D");
        System.out.println(amountF +" students got a F");
        
        grades.close();
    } // grades

    public static void reciprocal() {
    
    }
    
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