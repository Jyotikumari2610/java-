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
import java.util.*;
public class Users{
  /*  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int x=sc.nextInt();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("x to the power n is:"+result);
    }*/
    public static int calculatePower(int x, int n){
        int result=1;
        for(int i=0;i<n;i++){
            result *=x;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int x=sc.nextInt();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        calculatePower(x,n);
    }
}

