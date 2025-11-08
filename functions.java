import java.util.*;
public class Solution {
    public String average(int arr[],int n) {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double aveg=(double)sum/n;
        return String.valueOf(aveg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        String avg=ob.average(arr, n);
        System.out.println(avg);
    }
}
// Complete the function
// Take input for a and s
class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        while (t-- > 0) {
            
            int a = sc.nextInt();
            sc.nextLine();
            
            String s = sc.nextLine();
            // Your code here
            
            System.out.println(a);
            System.out.println(s);
        }
    }
    public static void main(String args[]){
        getInput();
    }
}
import java.util.*;
class Solution {
    public void swap(int a, int b) {
        // code here
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Solution obj=new Solution();
        obj.swap(a,b);
    }
}
public class Solution {
    public void utility(Scanner scn) {
        // code here
        String a=scn.nextLine();
        String b=scn.nextLine();
        System.out.println(a+" "+b);
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        Solution sol=new Solution();
        sol.utility(scn);
    }
}


