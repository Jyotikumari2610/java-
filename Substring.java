import java.util.*;
public class Strings {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Jyoti");
        System.out.println(sb);
      /*  //char at index 
       System.out.println(sb.charAt(2));
       */
     /*  //set char at index 
       sb.setCharAt(2,'y');
       System.out.println(sb);
       */
    /*   //Inserting of character
       sb.insert(2,'o');
       System.out.println(sb);
       */
     /*  //Deleting of character 
       sb.delete(2,3);
       System.out.println(sb);
       */
       // Addition of character
     /*  sb.append(" ");
       sb.append("K");
       sb.append("u");
       sb.append("m");
       sb.append("a");
       sb.append("r");
       sb.append("i");
       System.out.println(sb);
       //length of string
       System.out.println(sb.length());
       */
       //reversing of string
       for(int i=0;i<sb.length()/2;i++){
           int front =i;
           int back =sb.length()-1-i;
           char frontChar=sb.charAt(front);
           char backChar=sb.charAt(back);
           sb.setCharAt(front,backChar);
           sb.setCharAt(back,frontChar);
       }
       System.out.println(sb);
    }
}
