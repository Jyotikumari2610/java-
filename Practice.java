import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        // right angle pyramid pattern
      /*   for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("#");
        }
        System.out.println();
        } */
       //triangle pyramid pattern
     /*   for(int i=0;i<n;i++){
        for(int j=n-i;j>1;j--){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("# ");
        }
        System.out.println();   
       }*/
      //rectangle pattern
    /*   System.out.println("Enter another number:");
      int m=sc.nextInt();
         for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                System.out.print("#");
            }
                System.out.println();
            }   */
        //inverted right angle pyramid pattern
        for(int i=0;i<n;i--){
            for(int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        }
    }
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       /* int num=sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
             flag = true;
             break;
        }
    }
      if (!flag)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a primenumber.");
        */
        
      /*  int base =sc.nextInt();
        int exponent=sc.nextInt();
        long result = 1;
          while (exponent != 0) {
            result *= base;--exponent;
            }
        System.out.println("Answer = " + result);
        */
     /*   char ch =sc.next().charAt(0);
        int ascii=ch;
         System.out.println("The ASCII value of " + ch + " is: "+ ascii);
 */
/*    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int lcm = (n1 > n2) ? n1 : n2;
        while (true) {
          if (lcm % n1 == 0 && lcm % n2 == 0) {
            System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                 break;
                 }
                ++lcm;
           }
           */
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
            }
         }
    public static int fibonacci(int n) {
        if (n <= 1)
         return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
            }
 }
import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      /*  for(int i=2;i<=n;i++){
            while(n%i==0){
            System.out.print(i+" ");
            n/=i;
            }
        }*/
  int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
/*    for(int i=n-1;i>=0;i--){
        System.out.println(arr[i]);
    }*/
 /*   boolean asc=true;
    boolean dsc=true;
    for(int i=0;i<n-1;i++){
        if(arr[i]<arr[i+1]){
        dsc=false;
    }
    else if(arr[1]>arr[i+1]){
        asc=false;
    }
}
    System.out.println("Descending " +dsc);
    System.out.println("Ascending "+asc);
    */
    int sum=0;
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            sum+=arr[i];
            count++;
        }
    }
    float average=(float)sum/count;
    System.out.println(average);
  }
}
import java.util.*;
class Solution {
    static String revStr(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(revStr(s));
    }
}
import java.util.*;
public class Main {
    public static double area(int choice, double[] arr) {
        double result = 0;
        if (choice == 1) { 
            double R = arr[0];
            result = Math.PI * R * R;
        } 
        else if (choice == 2) { // Rectangle
            double L = arr[0];
            double B = arr[1];
            result = L * B;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt(); 
        if (choice == 1) {
            double R = sc.nextDouble();
            double[] arr = {R};
            System.out.println(area(choice, arr));
        } 
        else if (choice == 2) {
            double L = sc.nextDouble();
            double B = sc.nextDouble();
            double[] arr = {L, B};
            System.out.println(area(choice, arr));
        } 
        else {
            System.out.println("Invalid choice!");
        }   
    }
}


