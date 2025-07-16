if_else_if practice questions

  
  import java.util.*;
 public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter a number:");
        int n=sc.nextInt();*/
        
      /*  if(n%2==0)
        {
            System.out.println("Number is even.");
        }
        else {
            System.out.println("I don't know.");
        }*/
        /*if(n%2!=0){
            System.out.println("The number is odd.");
        }
        else {
            System.out.println("None...");
        }*/
        /*if(n>0){
            System.out.println("Number is positive.");
        }
        else if(n<0){
            System.out.println("Number is negative.");
        }
        else if(n==0){
            System.out.println("I'm Zero:)");
        }
        else {
            System.out.println("I'm dumb,I don't know anything.");
        }*/
       /* System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b.");
        }
        else if(a<b){
            System.out.println("a is lesser than b.");
        }
        else {
            System.out.println("a is equal to b.");
        }*/
       /* System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && b>c){
            System.out.println("a is larger");
        }
        else if(a<b && b>c){
            System.out.println("b is larger");
        }
        else if(c>a && b<c){
            System.out.println("c is larger");
        }
        else {
            System.out.println("all are equal");
        }*/
       /* System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }*/
        System.out.println("Enter age of a person:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Person is eligible to vote.");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
