public class FactorialRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {  
            return 1;
        } else {
            return n * factorial(n - 1); 
        }
    }
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}


public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0;  
        if (n == 1) return 1;  
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        int terms = 7;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

public class ReverseString {

    public static String reverse(String str) {
        if (str.isEmpty()) 
        return str;
        return reverse(str.substring(1)) + str.charAt(0); 
    }

    public static void main(String[] args) {
        String word = "java";
        System.out.println("Reversed string: " + reverse(word));
    }
}


public class GCDRecursion {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
