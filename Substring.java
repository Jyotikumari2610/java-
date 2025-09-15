import java.util.*;
public class Strings {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Jyoti");
        System.out.println(sb);
      /*  //char at index 
       System.out.println(sb.charAt(2));
       */
     /*  //set char at index 
       sb.setCharAt(2,'y');
       System.out.println(sb);
       */
    /*   //Inserting of character
       sb.insert(2,'o');
       System.out.println(sb);
       */
     /*  //Deleting of character 
       sb.delete(2,3);
       System.out.println(sb);
       */
       // Addition of character
     /*  sb.append(" ");
       sb.append("K");
       sb.append("u");
       sb.append("m");
       sb.append("a");
       sb.append("r");
       sb.append("i");
       System.out.println(sb);
       //length of string
       System.out.println(sb.length());
       */
       //reversing of string
       for(int i=0;i<sb.length()/2;i++){
           int front =i;
           int back =sb.length()-1-i;
           char frontChar=sb.charAt(front);
           char backChar=sb.charAt(back);
           sb.setCharAt(front,backChar);
           sb.setCharAt(back,frontChar);
       }
       System.out.println(sb);
    }
}
import java.util.Scanner;
public class CountVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int count=0;
      for (int i=0; i < str.length(); i++){
            char c=str.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
     System.out.println("Number of vowels: " + count);
    }
}
import java.util.Scanner;
 public class SumMethod{
    static int sum(int a, int b){
        return a + b;
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("Sum = " + result);
    }
}
class Student {
    String name;
    int age;
  Student(String n, int a){
        name = n;
        age = a;
    }
 void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student("Jyoti", 19);
        s1.display();
    }
}
