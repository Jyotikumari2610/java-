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
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    /*    System.out.println("Enter principal amount in rupess:");
        int p=sc.nextInt();
        System.out.println("Enter rate of interest per anum:");
        float r=sc.nextFloat();
        System.out.println("Enter time in years:");
        float t=sc.nextFloat();
        float SI=0;
        SI=(p*r*t)/100;
        System.out.println("Simple interest is: "+SI);
        */
     /*   System.out.println(".....Temperature Converter.....");
        System.out.println("1.Degree Celsius to Fahrenheit!!");
        System.out.println("2.Fahrenheit to Celsius!!");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.print("Enter temperature in celsius:");
            float celsius=sc.nextFloat();
            float fahrenheit=(celsius*1.8f)+32;
            System.out.println(+celsius+" celsius is "+fahrenheit+" in fahrenheit");
        }
        else if(choice==2){
            System.out.print("Enter temperature in Fahrenheit:");
            float fahrenheit=sc.nextFloat();
            float celsius=(fahrenheit-32)/1.8f;
            System.out.println(+fahrenheit+" fahrenheit is "+celsius+" in Celsius");
        }
        else{
            System.out.println("Invalid character!!");
        }
        */
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        int n = 0;
        word= word.toLowerCase();

        for(int i = 0; i < word.length(); i++) {
            char ch =word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                n++;
            }
        }
        System.out.println("Number of vowels in the string: " +n);

        
    }
}
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter element of 1st array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
         System.out.println("Enter element of 2nd array:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("equal elements in both array are:");
       int equal=0;
        for(int i=0;i<n;i++){
        for(int j = 0; j < n; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    equal++;
                }
            }
        }
        System.out.println("nTotal common elements: "+ equal);
    }
}
