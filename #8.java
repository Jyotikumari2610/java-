import java.util.*;
public class Functions{
   /* public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum (a,b);
        System.out.println("Sum of 2 numbers is:"+sum);
    }*/
   /* public static int calculateProduct(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication of 2 numbers is:" + calculateProduct(a,b));
    } */
   /* public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Input!");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
             factorial=factorial*i;
        }
        System.out.println(factorial);
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printFactorial(n);
    } */
}

import java. util.*;
public class Functions{
  /*  public static int printNumbers(int n){
        for(int i=1;i<n;i++){
            System.out.println(i);
        }
        return n;
    }
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int n=sc.nextInt();
   printNumbers(n);
    } */


   /* public static float checkDivisible(int num){
        if(num%5==0){
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not Divisible");
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        checkDivisible(num);
    } */
     public static int checkEvenOdd(int n){
         if(n%2==0){
             System.out.println("Even!!");
         }
         else if(n%2!=0){
             System.out.println("Odd!!");
         }
         else {
             System.out.println("Invalid Input!!");
         }
         return n;
     }
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int n=sc.nextInt();
         checkEvenOdd(n);
     }
}
import java.util.*;
public class Pattern{
       public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number:");
       int n=sc.nextInt();
 for(int i=n;i<=n;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       } */

    /*    for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");//spaces
            }
        for(int j=1;j<=i;j++){
            System.out.print("*");//stars
        }
        System.out.println();
    } */
   //Butterfly pattern
   //upper half
 /*  for(int i=1;i<=n;i++){
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
   }
   //Lower half
   for(int i=n;i>=1;i--){
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    for(int j=1;j<2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
   }
    */
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
    } 
public class MyClass {

public static void myMethod(int parameter1,String parameter2) {

System.out.println("Parameter 1: " +


parameter1);

System.out.println("Parameter 2: " +

parameter2);



}



public int addNumbers(int numi, int num2) {



int sum num1 num2;



return sum;

}

public static void main(String[] args) {

myMethod(10, "Hello");

MyClass obj = new MyClass();

int result = obj.addNumbers(5, 7);

System.out.println("Sum: " + result);


   }
