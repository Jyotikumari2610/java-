import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count<=2){
            System.out.println(" prime no");}
            else {
                System.out.println(" not prime");
            }
        }
    }

import java.util.*;
public class Welcome2{
        public static void main(String args[]){

                Scanner sc=new Scanner(System.in);

                /*for(;;){
                        System.out.println("Apni Kaksha");
                }*/
                /*System.out.println("Enter a number:");
                int n=sc.nextInt();
                for (int i=0;i<n;i++){
                        if(n%2==0)
                                System.out.println("Even Numbers");
                }*/
                /*System.out.println("Enter a number:");
                int n=sc.nextInt();
                System.out.println("Even numbers till"+n+"are:");
                for(int i=2;i<=n;i+=2){
                        System.out.println(i);
                } */
                System.out.println("Enter a number:");
                int n=sc.nextInt();
                boolean isprime=true;
                if(n<1){
                        isprime=false;
                        }
                else {
                for(int i=2;i<n/2;i++){
                        if(n%i==0){
                                isprime=false;
                                break;
                        }
                }
                }
                if(isprime)
                        System.out.println(n+"The number is prime!!");
                else
                        System.out.println(n+"Not prime Number!!");
        }                                                                                                                                                                 }   
