import java.util.*;
public class TwoDArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /* int[][] numbers=new int[2][4];
        System.out.println("Enter elements of numbers:");
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix formed is:");
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        */
    /*    System.out.println("Enter no of rows and colums:");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int matrix[][]=new int [rows][columns];
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a random number x:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==x)
                    System.out.println("x is found at:("+ i +"," + j +")");
                
            }
        }
        */
        System.out.println("Enter no of rows and columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int num[][]=new int [n][m];
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of given matrix:");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class TwoDArraySimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// Declare and initialize 2D array 
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < arr.length; i++) {         
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
  import java.util.*;
public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3]; //for columns and rows
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D array are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] sum = new int[2][2];
        System.out.println("elements of first matrix:");
        for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
   /*     for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }*/
        int[][] diff = new int[2][2];
         for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                diff[i][j] = mat1[i][j] - mat2[i][j];
            }
         }
        System.out.println("Difference of the two matrices:");
        for (int i = 0; i <2; i++){
            for (int j = 0; j <2; j++){
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}
