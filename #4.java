import java.util.*;

public class Welcome{
        public static void main(String args[] )
        {
/* Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number:");
                int n=sc.nextInt();
                int sum=0;
                for(int i=0;i<=n;i++){
                        sum=sum+i;
                }
                System.out.println(sum);

*/
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter a Number:");
                int n=sc.nextInt();
                for(int i=0;i<=10;i++){
                        System.out.println(i*n);
                }

        }

}
 public class Welcome1
{
        public static void main(String args[]){

           for(int i=0;i<=10;i++){
                   System.out.println(i);
           }

        }
} */
/*public class Welcome1{
        public static void main(String args[]){
                int i=0;
                while(i<=10){
                        System.out.println(i);
                        i++;
                }
        }
}
*/

   public class Welcome1{
           public static void main(String args[]){
                   int i=0;
                   do{
                           System.out.println(i);
                           i++;
                   }
                   while(i<=10);
           }
   }
