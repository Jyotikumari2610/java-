import java.util.*;
 public class Main {
    public static void display(int n,int r,int npr){
        System.out.println(n+"P"+r+"="+npr);
    }
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        display(n,r,npr);
    }
}

//HCF and LCM of two number
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num1=a;
        int num2=b;
        for(int i=0;i<=a;i++){
         int temp=a%b;
        a=b;
        b=temp;
        }
        int hcf=a;
        System.out.println("HCF of two number is:"+hcf);
        int lcm=1;
        lcm=(num1*num2)/hcf;
        System.out.println("LCM of number is:"+lcm);
    }
}
//Hcf  and lcm of number using array
import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array:");
       int n=sc.nextInt();
       int num[]=new int[n];
       System.out.println("Enter elements of array:");
       for(int i=0;i<n;i++){
           num[i]=sc.nextInt();
       }
       int a=num[0];
       int b=num[0];
       int hcf=num[0];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int temp=num[i]*num[j];
               num[i]=num[j];
               num[j]=temp;
           }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
        }
    }
    System.out.println("HCF of array is:"+hcf);
    int lcm=num[0];
    for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               a=num[i];
               b=num[j];
               lcm=(a*b)/hcf;
           }
       }
       System.out.println("LCM of array is:"+lcm);
}
}
