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

output 
Output:

Array elements:
Element at index 0: 10
Element at index 1: 20
Element at index 2: 30
Element at index 3: 40
Element at index 4: 50
Sum of all elements: 150

  import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        
        int[] numbers = {40, 10, 50, 30, 20};

       
        System.out.println("Original array: " + Arrays.toString(numbers));

       
        Arrays.sort(numbers);

      
  
        System.out.println("Sorted array (ascending): " + Arrays.toString(numbers));
    }
}
output 
  Original array: [40, 10, 50, 30, 20]
Sorted array (ascending): [10, 20, 30, 40, 50]

