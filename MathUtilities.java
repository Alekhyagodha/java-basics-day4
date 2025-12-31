public class MathUtilities {

    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Factorial of a number
    public static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Check if number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


class StringUtilities {

    // Reverse a string
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Remove duplicate characters
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

class ArrayUtilities {

    // Sort array (Bubble Sort)
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Linear search
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Find maximum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Reverse array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


class TestUtilityLibrary {
    public static void main(String[] args) {

        // ---- Math Utilities Test ----
        System.out.println("Power(2, 5): " + MathUtilities.power(2, 5));
        System.out.println("Factorial(5): " + MathUtilities.factorial(5));
        System.out.println("IsPrime(17): " + MathUtilities.isPrime(17));
        System.out.println("GCD(24, 36): " + MathUtilities.gcd(24, 36));

        // ---- String Utilities Test ----
        String text = "Programming";
        System.out.println("Reverse: " + StringUtilities.reverse(text));
        System.out.println("Is Palindrome (madam): " + StringUtilities.isPalindrome("madam"));
        System.out.println("Vowel Count: " + StringUtilities.countVowels(text));
        System.out.println("Remove Duplicates (banana): " + StringUtilities.removeDuplicates("banana"));

        // ---- Array Utilities Test ----
        int[] arr = {5, 2, 9, 1, 3};

        System.out.println("Max Element: " + ArrayUtilities.findMax(arr));

        ArrayUtilities.sort(arr);
        System.out.print("Sorted Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        System.out.println("Search 9 at index: " + ArrayUtilities.search(arr, 9));

        ArrayUtilities.reverseArray(arr);
        System.out.print("Reversed Array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}
