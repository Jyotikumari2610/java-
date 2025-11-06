import java.util.*;
public  class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            boolean swapped = true;
            int pass = 0;
            while (swapped) {
                swapped = false;
                pass++;
                for (int i = 0; i < n - pass; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
            }
            System.out.println("Sorted array:");
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.print("\nDo you want to sort another array? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program Ended!");
    }
}
import java.util.*;

public class SelectionSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;  
            int j = i + 1;  
            while(j < n) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
