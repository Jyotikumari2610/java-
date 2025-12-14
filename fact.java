public class FactorialExample {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 5; 
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
import java.util.*;
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<=n;i++){
            temp[i]=arr[n-i-1];
        }
        for(int i=0;i<=n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        Solution obj=new Solution();
        obj.reverseArray(arr);
    }
}
