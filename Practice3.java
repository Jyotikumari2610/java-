import java.util.*;
public class Users{
  //Write a function to calculate the square of a number
 /* public static int findSquare(int n){
      int result=1;
      for(int i=0;i<n;i++){
          result=n*n;
      }
      return result;
  }
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
    System.out.println("Square of the number is: " + findSquare(n));
  } */
  //Write a function to find the factorial of a number.
 /* public static int findFactorial(int n){
      int factorial=1;
      for(int i=1;i<=n;i++){
          factorial=factorial*i;
      }
      System.out.println(factorial);
      return 1;
  }
  public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
      findFactorial(n);
  } */
  //Write a function to print all even numbers up to n
 /* public static int findEvenOne(int n){
      for(int i=0;i<n;i++){
          if(i%2==0)
              System.out.println(i);
      }
      return 1;
  }
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
      System.out.println("Even No Are:" +findEvenOne(n));
  } */
  //Write a function that swaps two numbers using a third variable.
/* public static int swappingNos(int a,int b){
    int temp=0;
    temp=a;
    a=b;
    b=temp;
    System.out.println("Swapping of a to b:"+a);
    System.out.println("Swapping of b to a:"+b);
    return temp;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two number:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    swappingNos(a,b);
} */
//Write a function to reverse a number
 public static int reversingNos(int n){
    int rev=0;
    while(n>0){
        int p=n%10;
        rev=rev*10+p;
        n/=10;
    }
   System.out.println(rev);
    return rev;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    reversingNos(n);
}  
}
import java.util.*;

public class Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
     /*   int factorial = 1;
        for(int i=0; i<arr.length; i++) {
            factorial *= arr[i];
        }
        System.out.println("Product of array elements is: " + factorial);
        */
       /*   for (int i = 0; i < n; i++){
            int num = arr[i], j;
            for (j = 2; j < num; j++)
                if (num % j == 0) 
                break;
            if (num>=1 && j==num) 
            System.out.print("Prime nos are:-"+num + " ");
    } */
     for(int i=0;i<n;i++){
            if(arr[i]>0){
            System.out.println("Enterd array is positive:"+arr[i]);
        }
        }
        for(int i=0;i<n;i++){
        if(arr[i]>0){
            System.out.println("Enterd array is positive:"+arr[i]);
        }
        else{
            System.out.println("Enterd array is negative:"+arr[i]);
        }
    }
}
}

