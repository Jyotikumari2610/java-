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
1 2 3 
4 5 6
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
Enter 6 numbers:
78
32
45
67
89
21
2D array are:
78 32 45 
67 89 21 
