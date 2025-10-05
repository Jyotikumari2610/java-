import java.util.*;
public class Functions{
    //Write a Java program that takes a number and a digit as input, and counts how many times that digit occurs in the number
    public static int Dig(int n,int d){
            int rv=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if(dig==d){
                rv++;
            }
        }
        return rv;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Dig(n,d));
    }
}
import java.util.*;
class Student {
    String name;
    int roll;
    int marks;
    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}
public class StudentReport {
    public static double calculateAverage(Student[] students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        return (double) sum / students.length;
    }
  public static void sortByMarks(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public static void printReport(Student[] students) {
        System.out.println("\n------ STUDENT REPORT ------");
        for (Student s : students) {
            String result = (s.marks >= 40) ? "Pass" : "Fail";
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", Marks: " + s.marks + " (" + result + ")");
        }
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, roll, marks);
        }
        sortByMarks(students);
        printReport(students);

        double avg = calculateAverage(students);
        System.out.println("\nClass Average Marks: " + avg);
        System.out.println("\nTopper: " + students[0].name + " with " + students[0].marks + " marks!");
    }
}
