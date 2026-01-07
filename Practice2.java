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
//ncr using functions
import java.util.*;
public class Main {
    public static int Pcr(int n,int r){
        int fact=1;
        for(int i=0;i<r;i++){
        fact*=(n-i);
      }
         int nfact=1;
          for(int i=1;i<=r;i++){
           nfact*=i;
        }
        return fact/nfact;
         }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(Pcr(n,r));
    }
}
import java.util.*;
 public class Main {
    public static void display(int n,int r,int npr){
        System.out.println(n+"P"+r+"="+npr);
    }
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        display(n,r,npr);
    }
}


import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        float z=x/y;
        for(int i=1;i<=y;i++){
            int a=1;
            a/=i;
            System.out.println(a);
        }
        System.out.println(z);
    }
}
import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      /*  int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        */
    /*  int base=sc.nextInt();
       int exp=sc.nextInt();
      int result=1;
        for(int i=0;i<exp;i++){
            result*=base;
        }
        System.out.println(result);
        //find power by using math.pow command
        int result = (int)Math.pow(base, exp);
        System.out.println(result);
        */
   /*    int year=sc.nextInt();
       if(year%4==0){
           System.out.println(+year+" is Leap Year!!");
       }
       else {
           System.out.println(+year+" is not a leap year");
       }
       */
    /*   int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(temp>0){
       int r=temp%10; 
       sum=sum+r*r*r; 
       temp=temp/10;
       }
       System.out.println(sum==n ? "Armstrong" : "Not Armstrong");
*/
     /*   char ch=sc.next().charAt(0);  
        int ascii=ch;
        System.out.println("The ASCII value of "+ch+" is: "+ascii);
       */
       int a=20,b=8;  
       while(b!=0){
        int temp=b; 
        b=a%b; 
        a=temp;
       }
       System.out.println("GCD = "+a);

    }
}
public class Main {
    public static void main(String[] args) {
     /* int n=10;
      for(int i=0;i<n;i++){
          for(int j=0;j<n-i;j++){
              System.out.print(" ");
          }
          for(int j=0;j<i;j++){
              System.out.print(i+ " ");
          }
          System.out.println();
      }*/
     /* int n=5;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
          System.out.print(j);
        }     
        for(int j=2;j<=i;j++){
          System.out.print(j);
        }
        System.out.println();
      } 
/*import java.util.*;
public class Solution {
    public static void utility(Scanner scn) {
        String a = scn.nextLine();
        String b = scn.nextLine();
        String separator = scn.nextLine();
        // print with seperator
        separator=separator.replace(" ","@");
        System.out.println(separator);
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        utility(scn);
    }
}
*/
/*import java.util.*;
class Solution {
    public static void utility(int x) {
        // code here
        while(x>=0){
            System.out.println(x);
        }
        x--;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution obj=new Solution();
        obj.utility(x);
    }
}
*/
/*import java.util.*;
class Solution {
    public static void difference(int n1) {
        // Write your code here
        int table=0;
        for(int i=1;i<=10;i++){
            table=n1*i;
        System.out.println(table);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        difference(n1);
}
}
*/
// User function Template for Java
import java.util.*;
class Solution {
    public static void difference(int n1, int n2) {
        // Write your code here
        int table1=0;
        for(int i=1;i<=10;i++){
            table1=n1*i;
        }
        int table2=0;
        for(int i=1;i<=10;i++){
            table2=n2*i;
        }
        for(int i=1;i<=10;i++){
        if(n1>n2){
            System.out.println(table1-table2);
        }
        else{
            System.out.println(table2-table1);
        }
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Solution obj=new Solution();
        obj.difference(n1,n2);
    }
}
     
class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.equals(s2)){
                return true;
            }
            char last=s1.charAt(s1.length()-1);
            s1=last+s1.substring(0,s1.length()-1);
        }
        return false;
    }
    public static void main(String args[]){
        String s1="abcd";
        String s2="bcda";
        Solution obj=new Solution();
        obj.areRotations(s1,s2);
    }
    
}
     class Solution {
    public int minChar(String s) {
        // code here
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            boolean isPalindrome=true;
            int left=0;
            int right=i;
            for(;left<right;left++,right--){
                if(s.charAt(left)!=s.charAt(right)){
                    isPalindrome=false;
                    break;
                }
            }
            if(isPalindrome){
            return n-i-1;
        }
    }
    return n-1;
    }
}
