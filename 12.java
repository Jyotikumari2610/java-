import java.util.*;
public class Sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     /*   Arrays.sort(arr);
        System.out.println("Sorted array (ascending): " + Arrays.toString(arr));
        */
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
import java.util.*;
public class BubbleSortInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    /*    for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        */
      /*  for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] < arr[j+1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
        */
        
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; 
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();
        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("Anagram!");
        else
            System.out.println("Not an Anagram!");
    }
}
import java.util.*;
class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i]-1;
        }
       
       return  result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       decrementArrayElements(arr);
    }
}
import java .util.*;
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }
    return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.largest(arr);
    }
}
class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.arraySum(arr);
    }
}
import java.util.*;
class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
            sum+=arr[i];
            count++;
            }
        }
        if (count==0)  return 0;
       return (double)sum/count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        double result=obj.posAverage(arr);
    }
}
