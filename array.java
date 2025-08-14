public class ArrayExample {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}

  import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        
        int[] numbers = {40, 10, 50, 30, 20};

       
        System.out.println("Original array: " + Arrays.toString(numbers));

       
        Arrays.sort(numbers);

      
  
        System.out.println("Sorted array (ascending): " + Arrays.toString(numbers));
    }
}
import java.util.*;
public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
      /*  for(int i=0;i<size;i++){
    
            if(arr[i]%2==0){
            System.out.println("Sorted array is even numbers:" + (arr[i]));
            }
        else{
            System.out.println("Sorted array is odd numbers:" + (arr[i]));
            
        }*/
       /* for(int i=0;i<size;i++){
                    if(arr[i]>0){
            System.out.println("Enterd array is positive:"+arr[i]);
        }
        }
        for(int i=0;i<size;i++){
        if(arr[i]>0){
            System.out.println("Enterd array is positive:"+arr[i]);
        }
        else{
         System.out.println("Enterd array is negative:"+arr[i]);

        }
}*/
for(int i=0;i<arr.length;i++){
    int largest = arr[0];
    int secondLargest = arr[0];
    int smallest = arr[0];
    int secondSmallest = arr[0];
    for (int num : arr) //used to read elements from the given array
         {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (largest == smallest) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
            System.out.println("Second largest: " + secondLargest);
        }
    }
    }
}
import java.util.*;
public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    /*    int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        */
     /*   int evenCount = 0, oddCount = 0;//to count how many no are even or odd
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    */
  /*  System.out.print("Enter element to search: ");
        int a =sc.nextInt();
         boolean found=false;
        for (int i = 0; i < size; i++) {
            if (arr[i]==a) {
                System.out.println("Element found at index " +i);
                found =true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in array.");
    } */
     for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp =arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1]= temp;
                }
            }  }
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
}
