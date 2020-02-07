import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Student {
    long studentid;
    int grade;
    String lastname;
    String firstname;
    String gender;

    Student(int studentid, int grade, String lastname, String firstname, String gender) {
        this.studentid  = studentid;
        this.grade      = grade;
        this.lastname   = lastname;
        this.firstname  = firstname;
        this.gender     = gender;
    } // student
} // student class

class bruh {
    public static void main(String[] args) throws FileNotFoundException {
        int studentamount;
        String filename;
        Scanner maininput = new Scanner(System.in);
        System.out.println("input file name");
        filename = maininput.next();
        // studentamount = filelength(filename);
        Student[] students = new Student[100];
        // Student[] students = new student(studentid, grade, lastname, firstname,
        // gender);
        Scanner classlist = new Scanner(new File(filename));
        int i = 0;

        int id;
        int grade;
        String lastname;
        String firstname;
        String gender;

        while (classlist.hasNext()) {
            id          = classlist.nextInt();
            grade       = classlist.nextInt();
            lastname    = classlist.next();
            firstname   = classlist.next();
            gender      = classlist.next();
            i++;
            students[i] = new Student(id, grade, lastname, firstname, gender);
        }

      problemOne(students);
    } // main

    public static void problemOne(Student[] students) {
        int gradeAmount[] = new int[4]; // 0 = freshmen; 1 = sophomores; 2 = juniors; 3 = seniors
        int genderAmount[] = new int[2]; // 0 = male; 1 = female
        int curGrade;
        String curGender;

        for (int i = 0; i < students.length; i++) {
            curGender = students[i].gender; // fill gender
            if (curGender.toLowerCase() == "male") {
                genderAmount[0] += 1;
            } else if (curGender.toLowerCase() == "female") {
                genderAmount[1] += 1;
            }

            curGrade = students[i].grade; // fill grade
            if (curGrade == 9) {
                gradeAmount[0] += 1;
            } else if (curGrade == 10) {
                gradeAmount[1] += 1;
            } else if (curGrade == 11) {
                gradeAmount[2] += 2;
            } else if (curGrade == 12) {
                gradeAmount[3] += 1;
            }

        }
    } // problem one

    public static int filelength(String filename) throws FileNotFoundException {
        Scanner filesize = new Scanner(new File(filename));
        int filelenth = 0;

        while (filesize.hasNextLine()) {
            filelenth += 1;
        }
        filesize.close();
        return filelenth;
    } // filelenth
} // lab8