import java.util.*;
public class Sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     /*   Arrays.sort(arr);
        System.out.println("Sorted array (ascending): " + Arrays.toString(arr));
        */
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
import java.util.*;
public class BubbleSortInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    /*    for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        */
      /*  for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] < arr[j+1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
        */
        
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; 
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
