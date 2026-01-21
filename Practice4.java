import java.util.*;
 public class Practice2{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        /* System.out.println("Enter a number:");
         int n=sc.nextInt();
         System.out.println("Even numbers upto "+n+" are");
         for(int i=0; i<n;i++){
             if(i%2==0)
             System.out.println(i);
         }*/
         /*System.out.println("Enter a number:");
         int a=sc.nextInt();
         System.out.println("Odd numbers upto "+a+" are:");
         for(int i=0;i<a;i++){
             if(i%2!=0)
                 System.out.println(+i+" ");
         }*/
         /*System.out.println("Enter a number:");
         int n=sc.nextInt();
         int sum=0;
         for(int i=0;i<n;i++){
             sum+=i;
             System.out.println("sum:" +sum);
         }
         //if printing statement of sum is inside loop then we will able to see each process step by step:)
          System.out.println("sum:" +sum);
          //if printing statement of sum is outside loop then we will able to see only result not step:)
         */
        /* System.out.println("Enter a number:");
         int a=sc.nextInt();
         int diff=0;
         for(int i=0;i<a;i++){
             diff-=i;
         }
         System.out.println(diff);  
         }*/
         System.out.print("Enter a number:");
         int n=sc.nextInt();
         int a=0;
         for(int i=1;i<10;i++){
             a=n*i;
              System.out.println(a);
         }
     }
 }

import java.util.*;
  public class Function{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int positiveCount=0;
    int negativeCount=0;
    int zeroCount=0;
    char choice;
    do{
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       if(n>0){
           positiveCount++;
    }
    else if(n<0){
        negativeCount++;
    }
    else {
        zeroCount++;
    }
    n++;
    System.out.println("Do u wnt to continue?y/n:");
     choice=sc.next().charAt(0);
    }
    while(choice=='y' || choice=='Y');
    
   System.out.println(positiveCount);
   System.out.println(negativeCount);
   System.out.println(zeroCount);
}
}
import java.util.*;
public class Wlcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(+a+"*" +i+"="+(a*i));
        }
        for(int j=1;j<=10;j++){
            System.out.println(+b+"*" +j+"="+(b*j));
        }
    }
  }
