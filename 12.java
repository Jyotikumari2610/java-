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
import java.util.*;
class Solution {
    public static void printPrimeFactorization(int n) {
        // code here
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       printPrimeFactorization(n);
    }
}

import java.util.*;
class Solution {
    public static int firstDigit(int n) {
        // code here
       while(n>=10){
           n/=10;
       }
       return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        firstDigit(n);
    }
}
import java.util.*;
class Solution {
    public static String sliceString(String s) {
        // code here
       if(s.length()<=2){
           return " ";
       }
        return s.substring(1,s.length()-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.sliceString(s);
    }
}

import java.util.*;
class Solution {
    public static void changeCase(String s) {
        // code here
       s=s.substring(0,1).toUpperCase()+s.substring(1);
       System.out.println(s);
      System.out.println(s.toUpperCase());
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        changeCase(s);
    }
}
import java.util.*;
class Solution {
    public static boolean isPanagram(String str) {
        // Your code here
        boolean isPanagram=str.toLowerCase().chars().filter(Character::isLetter).distinct().count()==26;
        return isPanagram;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Solution obj=new Solution();
        obj.isPanagram(str);
    }
}
// User function Template for Java
import java.util.*;
class Solution {
    public static char extraChar(String s1, String s2) {
        // write your code here
       char ans=0;
       for(char ch:(s1+s2).toCharArray()){
           ans^=ch;
       }
       return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Solution obj=new Solution();
        obj.extraChar(s1,s2);
    }
}
import java.util.*;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
       if(Arrays.equals(a,b)){
           return true;
       }
       return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Solution obj=new Solution();
        obj.areAnagrams(s1,s2);
    }
}
import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        s=s.toLowerCase();
        String rev=new StringBuilder(s).reverse().toString();
        return s.equals(rev);
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.isPalindrome(s);
    }
}
class Solution {
    public static String reverseString(String s) {
        // code here
        String rev=new StringBuilder(s).reverse().toString();
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution obj=new Solution();
        obj.reverseString(s);
    }
}

