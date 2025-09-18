import java.util.*;
public class Functions{
    //Write a Java program that takes a number and a digit as input, and counts how many times that digit occurs in the number
    public static int Dig(int n,int d){
            int rv=0;
        while(n>0){
            int dig=n%10;
            n=n/10;
            if(dig==d){
                rv++;
            }
        }
        return rv;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Dig(n,d));
    }
}
