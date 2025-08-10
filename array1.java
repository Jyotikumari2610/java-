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
