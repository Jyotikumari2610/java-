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

