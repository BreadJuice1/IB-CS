import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    long studentid;
    int grade;
    String lastname;
    String firstname;
    String gender;

    Student(int studentid, int grade, String lastname, String firstname, String gender) {
        this.studentid = studentid;
        this.grade = grade;
        this.lastname = lastname;
        this.firstname = firstname;
        this.gender = gender;
    } // student
} // student class

class bruh {
    public static void main(String[] args) throws IOException {
        int studentamount;
        String filename;
        Scanner maininput = new Scanner(System.in);
        System.out.println("input file name");
        filename = maininput.next();
        Student[] students = new Student[100];
        Scanner classlist = new Scanner(new File(filename));
        int studentAmount = 0;
        int progNum;

        int id;
        int grade;
        String lastname;
        String firstname;
        String gender;

        while (classlist.hasNext()) {
            id = classlist.nextInt();
            grade = classlist.nextInt();
            lastname = classlist.next();
            firstname = classlist.next();
            gender = classlist.next();
            studentAmount++;
            students[studentAmount] = new Student(id, grade, lastname, firstname, gender);
        }

        menu(students, studentAmount);
    } // main

    public static void menu(Student[] students, int studentAmount) throws IOException {
        System.out.println("which problem do you want to run? \n 1. statistics \n 2. bubble-sort");
        Scanner in = new Scanner(System.in);
        int progNum;
        progNum = in.nextInt();
        switch (progNum) {
            case 1:
                stats(students, studentAmount);
                menu(students, studentAmount);
                break;
            case 2:
                bubbleSort(students, studentAmount);
                menu(students, studentAmount);
                break;
            default:
                break;
        } // switch

    } // menu

    private static void bubbleSort(Student[] students, int studentAmount) throws IOException {
        students[studentAmount+1] = new Student(1,2,"","",""); // temp student
        String bruh;
        String bruh2;
        try (FileWriter writer = new FileWriter("class.txt");
        BufferedWriter bw = new BufferedWriter(writer)) {
            for (int i = 1; i <= studentAmount; i++) {
                bruh = students[i].lastname;
                bruh2 = students[i+1].lastname;
                if (bruh.compareToIgnoreCase(bruh2) < 0) {
                    students[studentAmount+1].lastname = bruh;
                    students[i].lastname = bruh2;
                    students[i+1].lastname = students[studentAmount+1].lastname;
                    bw.append(i + " " + students[i].lastname);
                } else if (bruh.compareToIgnoreCase(bruh2) == 0) {
                    bw.append(bruh);
                } else if (bruh.compareToIgnoreCase(bruh2) > 0) {
                    bw.append(bruh);
                }
                bw.newLine();
            }
            
        }

      /*  students[studentAmount+1] = new Student(1,2,"","",""); // temp student
        for (int i = 1; i <= studentAmount; i++) {
            if (students[i].lastname.compareToIgnoreCase(students[i+1].lastname) == 1) {
                students[studentAmount+1] = students[i];
            }
        } */


    } // bubble sort

    public static void stats(Student[] students, int studentAmount) {
        int gradeAmount[] = new int[4]; // 0 = freshmen; 1 = sophomores; 2 = juniors; 3 = seniors
        int genderAmount[] = new int[2]; // 1 = male; 0 = female
        int curGrade;
        String curGender;

        for (int i = 1; i <= (studentAmount); i++) {
            curGender = students[i].gender; // fill gender
            if (curGender.toLowerCase().contains("female")) {
                genderAmount[0] += 1;
            } else {
                genderAmount[1] += 1;
            }
        }

        for (int j = 1; j <= (studentAmount); j++) {
            curGrade = students[j].grade; // fill grade
            if (curGrade == 9) {
                gradeAmount[0] += 1;
            } else if (curGrade == 10) {
                gradeAmount[1] += 1;
            } else if (curGrade == 11) {
                gradeAmount[2] += 1;
            } else if (curGrade == 12) {
                gradeAmount[3] += 1;
            }
        }

        System.out.print("\n" + "Female: " + genderAmount[0]);
        System.out.println("\n" + "Male: " + genderAmount[1]);

        System.out.print("\n" + "Freshmen: " + gradeAmount[0]);
        System.out.print("\n" + "Sopohmores: " + gradeAmount[1]);
        System.out.print("\n" + "Juniors: " + gradeAmount[2]);
        System.out.println("\n" + "Seniors: " + gradeAmount[3]);
    } // problem one
} // lab8