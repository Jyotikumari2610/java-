import java.util.*;
public class Strings{
    public static void main(String args[]){
       /* String name="Jyoti Kumari";
        System.out.println("Your name is: "+name);
        */
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
      //  String name=sc.next(); //print onle word not sentence
        String name=sc.nextLine(); //print sentence
        System.out.println("Name is:"+name);
        */
        //Addition of two string 
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        String fullName=name1 +" "+name2;
        System.out.println(fullName);
        */
        //Lenth of string
    /*    String name="Jyoti kumari";
        System.out.println(name.length());
        //charAt
        for(int i=0;i<name.length();i++){
        System.out.println(name.charAt(i));
        }
        */
        //Comparison of two Strings
   /*     Scanner sc=new Scanner(System.in);
        System.out.println("Enter two name:");
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("Strins are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }   */
        //Substring
        String sentence="Jyoti kumari";
        String name1=sentence.substring(5);
        String name2=sentence.substring(0,sentence.length());
        System.out.println(name1);
        System.out.println(name2);
        
    }
}
