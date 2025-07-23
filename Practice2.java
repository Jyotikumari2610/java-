// for loop practice questions
import java.util.*;
 public class Practice2{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        /* System.out.println("Enter a number:");
         int n=sc.nextInt();
         System.out.println("Even numbers upto "+n+" are");
         for(int i=0; i<n;i++){
             if(i%2==0)
             System.out.println(i);
         }*/
         /*System.out.println("Enter a number:");
         int a=sc.nextInt();
         System.out.println("Odd numbers upto "+a+" are:");
         for(int i=0;i<a;i++){
             if(i%2!=0)
                 System.out.println(+i+" ");
         }*/
         /*System.out.println("Enter a number:");
         int n=sc.nextInt();
         int sum=0;
         for(int i=0;i<n;i++){
             sum+=i;
             System.out.println("sum:" +sum);
         }//if printing statement of sum is inside loop then we will able to see each process step by step:)
          System.out.println("sum:" +sum);
          //if printing statement of sum is outside loop then we will able to see only result not step:)
         */
        /* System.out.println("Enter a number:");
         int a=sc.nextInt();
         int diff=0;
         for(int i=0;i<a;i++){
             diff-=i;
         }
         System.out.println(diff);  
         }*/
         System.out.print("Enter a number:");
         int n=sc.nextInt();
         int a=0;
         for(int i=1;i<10;i++){
             a=n*i;
              System.out.println(a);
         }
     }
 }

import java.util.*;
public class main{
    public static void main(String args[]){
        //Print a Right-Angle Triangle Pattern of #
       /* int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }*/
       // Print Multiplication Table of a Number
       /*Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=sc.nextInt();
       int a=0;
       for(int i=1;i<=10;i++){
           a=n*i;
           System.out.println(a);
       }*/
       //Write a Java program to take marks (0–100) from the user and print the grade
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of students:");
       int marks=sc.nextInt();
       if(marks<=95 && marks>=70){
           System.out.println("Grade A");
       }
       else if(marks<=70 && marks>=50){
           System.out.println("Grade B");
       }
       else if(marks<=50 && marks>=30){
           System.out.println("Passed");
       }
       else {
           System.out.println("Failed One!!");
       }
       
    }
}
import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int factorial=1;
        
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
