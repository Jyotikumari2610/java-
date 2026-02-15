if_else_if practice questions

  
  import java.util.*;
 public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter a number:");
        int n=sc.nextInt();*/
        
      /*  if(n%2==0)
        {
            System.out.println("Number is even.");
        }
        else {
            System.out.println("I don't know.");
        }*/
        /*if(n%2!=0){
            System.out.println("The number is odd.");
        }
        else {
            System.out.println("None...");
        }*/
        /*if(n>0){
            System.out.println("Number is positive.");
        }
        else if(n<0){
            System.out.println("Number is negative.");
        }
        else if(n==0){
            System.out.println("I'm Zero:)");
        }
        else {
            System.out.println("I'm dumb,I don't know anything.");
        }*/
       /* System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b.");
        }
        else if(a<b){
            System.out.println("a is lesser than b.");
        }
        else {
            System.out.println("a is equal to b.");
        }*/
       /* System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && b>c){
            System.out.println("a is larger");
        }
        else if(a<b && b>c){
            System.out.println("b is larger");
        }
        else if(c>a && b<c){
            System.out.println("c is larger");
        }
        else {
            System.out.println("all are equal");
        }*/
       /* System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }*/
        System.out.println("Enter age of a person:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Person is eligible to vote.");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
import java.util.*;
public class Functions{
 /*   public static int sumofOdd(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
            sum+=i;
            }
        }
         System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(sumofOdd(n));
    } */
    public static int sumofEven(int n){
        int sum=0;
        int difference=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
            sum+=i;
            difference-=i;
            }
        }
        System.out.println(sum);
         System.out.println(difference);
         return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(sumofEven(n));
    }
 }
import java.util.*;
class Solution {
  public int findMax(int[] nums) {
    // write your code here
    int n=nums.length;
    int max=0;
    for(int i=0;i<n;i++){
      if(nums[i]>max){
        nums[i]=max;
      }
    return max;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    Solution obj=new Solution();
    int result=obj.findMax(nums);
    System.out.println(result);
  }
}
import java.util.Scanner;

public class StrassenMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

     
        System.out.println("Enter Matrix A (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

      
        System.out.println("Enter Matrix B (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        int M1 = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        int M2 = (A[1][0] + A[1][1]) * B[0][0];
        int M3 = A[0][0] * (B[0][1] - B[1][1]);
        int M4 = A[1][1] * (B[1][0] - B[0][0]);
        int M5 = (A[0][0] + A[0][1]) * B[1][1];
        int M6 = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        int M7 = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

        // Result matrix
        C[0][0] = M1 + M4 - M5 + M7;
        C[0][1] = M3 + M5;
        C[1][0] = M2 + M4;
        C[1][1] = M1 - M2 + M3 + M6;
        System.out.println("\nResult Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
