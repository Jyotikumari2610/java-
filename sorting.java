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
