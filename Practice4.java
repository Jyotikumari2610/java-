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
import java.util.*;
public class Functions{
    /* public static float printAverage(int a,int b,int c){
        float average=(a+b+c)/3;
        System.out.println(average);
        return average;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printAverage(a,b,c);
    } */
   /* public static int sumOfOdd(int n){
        int sum=0;
    for(int i=0;i<n;i++){
        if(i%2!=0){
        sum+=i;
    }
    }
    return sum;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(sumOfOdd(n));

    } */
/*     public static int greaterOne(int a,int b){
        
        if(a>b){
        System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        return 1;
         
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        greaterOne(a,b);

    } */
    
}
import java.util.*;
  public class Function{
    /* public static int helloCircle(int radius){
        float pie= 3.142f;
        float circumfrence=0;
        circumfrence=2*pie*radius;
        System.out.println(circumfrence);
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int radius= sc.nextInt();
        helloCircle(radius);
    } */
   /* public static int voteEligibility(int age){
        if(age>18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of person:");
        int age=sc.nextInt();
        voteEligibility(age);
    } */
     public class Condition{
    public static void main(String args[]){
        int i=0;
        do {
            System.out.println(i);
            i++;
        }
            while(true);
    }
}
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter elements in array:");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("First elements:"+num[0]);
        System.out.println("Last elements:"+num[size-1]);
        for(int i=0, j=size-1;i<j;i++,j--){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        System.out.println("Reversed array"+ Arrays.toString(num));
        boolean found=false;
        for(int i=0;i<size;i++){
         if(num[i]<0){
             System.out.println("First negative integer at index"+i);
             found=true;
             break;
         }  
        }
         if(!found)
             System.out.println("No Negative integers");
         
       }
    }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
      /*  int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
        }
        System.out.println(fact);
        */
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       /* int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even+" "+odd);
        */
      /*  int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println(pos+" "+neg);
        */
      /*  int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum+" "+oddsum);
        */
      /*  int largest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
        */
        int largest=0;
        int scndlargest=0;
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                scndlargest=largest;
                largest=arr[i];
            }
            else if(scndlargest<arr[i] && arr[i]!=largest){
                scndlargest=arr[i];
            }
        }
        System.out.println(scndlargest);
    }
}
