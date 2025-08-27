import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        // right angle pyramid pattern
      /*   for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("#");
        }
        System.out.println();
        } */
       //triangle pyramid pattern
     /*   for(int i=0;i<n;i++){
        for(int j=n-i;j>1;j--){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print("# ");
        }
        System.out.println();   
       }*/
      //rectangle pattern
    /*   System.out.println("Enter another number:");
      int m=sc.nextInt();
         for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                System.out.print("#");
            }
                System.out.println();
            }   */
        //inverted right angle pyramid pattern
        for(int i=0;i<n;i--){
            for(int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
        }
    }

