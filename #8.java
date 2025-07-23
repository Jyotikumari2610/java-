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
