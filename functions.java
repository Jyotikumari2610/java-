import java.util.*;
public class Solution {
    public String average(int arr[],int n) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double aveg=(double)sum/n;
        return String.valueOf(aveg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        String avg=ob.average(arr, n);
        System.out.println(avg);
    }
}
// Complete the function
// Take input for a and s
class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        while (t-- > 0) {
            
            int a = sc.nextInt();
            sc.nextLine();
            
            String s = sc.nextLine();
            // Your code here
            
            System.out.println(a);
            System.out.println(s);
        }
    }
    public static void main(String args[]){
        getInput();
    }
}
import java.util.*;
class Solution {
    public void swap(int a, int b) {
        // code here
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        obj.swap(a,b);
    }
}
public class Solution {
    public void utility(Scanner scn) {
        // code here
        String a=scn.nextLine();
        String b=scn.nextLine();
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        Solution sol=new Solution();
        sol.utility(scn);
    }
}
import java.util.*;
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not allowed.");
            return 0;
        }
        return (double)a / b;
    }
    public static void menu() {
        System.out.println("\n***** CALCULATOR MENU *****");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. EXIT");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
 while (true) {
            menu();
            choice = sc.nextInt(); 
     if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
         switch (choice) {
                case 1:
                    System.out.println("Result = " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result = " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result = " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result = " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
    }
}
import java.util.*;
class Solution {
    public int lastDigit(int n) {
        // Code here
            n=n%10;
            return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.lastDigit(n);
    }
}
import java.util.*;
class Solution {
    public static void utility(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            if(i%2==0)
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.utility(s);
    }
}
// User function Template for Java
import java.util.*;
class Solution {
    public static String utility(int number) {
        // write your code here
        switch(number){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Unknown";
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Solution obj=new Solution();
        obj.utility(number);
    }
}
// User function Template for Java
import java.util.*;
class Solution {
    public static String utility(int n) {

        // write your code here
        if(n%2==1)
            return "You";
        else
        return "Friend";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        obj.utility(n);
    }
}

