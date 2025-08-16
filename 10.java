import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            int p=n%10;
            sum+=p;
            n/=10;
        }
        System.out.println("The sum is: "+sum);
        }
    }
output
  786
The sum is: 21

  import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int same=n;
        int sum=0;
        while(n>0){
            int p=n%10;
             sum+=p*p*p;
            n/=10;
        }
        if (same==sum){
            System.out.println(+same+" is armstrong.");
        }
        else {
            System.out.println(+same+" is not armstrong.");
        }}}
output
  153
153 is armstrong.

  class Mian{
    public static void main(String args[]){
        int n=15;
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
output
  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 

  class Main{
    public static void main(String args[]){
        int n=15;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
output
  2 4 6 8 10 12 14 
