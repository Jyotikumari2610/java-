//Array  Starting:- introduction 
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* int arr1[]=new int[5];
        arr1[0]=10;
        arr1[1]=12;
        arr1[2]=15;
        arr1[3]=19;
        arr1[4]=16;
        for(int i=0;i<arr1.length;i++)
        //size of array=array.length:)
        { 
        System.out.println(arr1[i]);
    }*/
    /*int[] arr = {1,3,6,7,8,6};
    for(int i=0;i<arr.length;i++){
    System.out.println("Arrays of element is: "+arr[i]);
} */
/*int num[]=new int[5];
System.out.println("Enter five elment of array:");

for(int i=0;i<num.length;i++){
    num[i]=sc.nextInt();
}
System.out.println("You entered:");
for(int i=0;i<num.length;i++){
    if(i%2==0)
    System.out.println(num[i]);
}*/
System.out.println("Enter size of an array:");
int size=sc.nextInt();
int numbers[]=new int[size];
for(int i=0;i<size;i++){
    System.out.println("Enter element of an array:");
    numbers[i]=sc.nextInt();
}
System.out.println("You entered!");
for(int i=0;i<size;i++){
    System.out.println(numbers[i]);
}
}
}
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* int arr[]=new int[5];
        System.out.println("Enter the  elemets of array of 5 integers:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("The integers in the array is:"+arr[i]);
    }*/
   /* System.out.println("Enter size of an array:");
    int size=sc.nextInt();
    int num[]=new int[size];
    System.out.println("Ente elements in array:");
    for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.println("Entered array is:"+num[i]);
    }*/
    int arr[]=new int[6];
    int sum=0;
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        sum += arr[i];
    }
    System.out.println("Sum of all elements in array is:"+sum);
}
}
