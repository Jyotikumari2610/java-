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


import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        float z=x/y;
        for(int i=1;i<=y;i++){
            int a=1;
            a/=i;
            System.out.println(a);
        }
        System.out.println(z);
    }
}
