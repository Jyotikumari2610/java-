//Array basic level questions
import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Declare and initialise an array of 5 integers 
        
      /*  int[] num={12,45,67,87,77};
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }*/
        
        //take 5 integers as input and display them
        
       /* int num[]=new int[5];
        System.out.println("Enter elements of array:");
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Entered array is:");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }*/
        //find the length of an array without hardcoding the
      /*  System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
          System.out.println("Length of the array: " + arr.length);
*/
//find average  and sum of an array
      /*  int[] arr={33,45,81,34,56};
       int sum=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
     float average=(float)sum/arr.length;
      System.out.println(sum);
    System.out.println(average);
    */
    //print the first, middle and last element of an array
    System.out.println("Enter size of a array:");
    int size=sc.nextInt();
    int num[]= new int[size];
    System.out.println("Enter elements of an array:");
    for(int i=0;i<size;i++){
        num[i]=sc.nextInt();
    }
    int first_element=num[0];
    int middle_element=num[size/2];
    int last_element=num[size-1];
    System.out.println(first_element);
    System.out.println(middle_element);
    System.out.println(last_element);
}
}
import java.util.*;
public class Araay{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
//Input n elements in an array and display them in reverse order.
      /*  System.out.println("reversed of each digit:");
        for(int i=0;i<size;i++){
            int original=num[i];
            int rev=0;
            while(original>0){
                int digit =original%10;
                rev=rev*10+digit;
                original/=10;
            }
            System.out.println("reverse of"+num[i]+"is:"+rev);
        }
*/
//Find the maximum and minimum element in an array
/*int max=num[0];
int min=num[0];
for(int i=0;i<size;i++){
    if(num[i]>max){
        max=num[i];
    }
    else if(num[i]<min){
        min=num[i];
    }
    else {
        System.out.println("");
    }
}
    System.out.println("The maximum number is:"+max);
    System.out.println("The minimum number is:"+min);
    */
    //search for a given number x and print the index at which it occurs
    System.out.println("enter new numbers:");
    int x=sc.nextInt();
    for(int i=0;i<size;i++){
     if(num[i]==x){
         System.out.println("x found at index:"+i);
     }
    }
    }}
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
       /* int arr1[]=new int [size];
        int arr2[]=new int [size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
         arr2[i]=arr1[i];
        }
    System.out.println("Copied array elements are:");
    for(int i=0;i<size;i++){
        System.out.println( arr2[i] +" " );
    }*/
   /* int arr[]=new int[size];
    int sum=0;
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    System.out.println("Sum of array elements is:"+sum);
    float average=sum/5;
    System.out.println("average of array elements is:"+average);
    */  
}
}
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of an array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean palindrome=true;
        for(int i=0;i<size/2;i++){
            if(arr[i]!=arr[size-1-i]){
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome!!");
        }
        else{
            System.out.println("Not Palindrome!!");
        }
    }
}
