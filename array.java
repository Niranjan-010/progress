// public class Main {
//     public static void main(String[] args) {

//         int[] numbers = {10, 20, 30, 40, 50};

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Array elements:");

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int largest = arr[0];
//         int smallest = arr[0];

//         for (int i = 1; i < n; i++) {

//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }

//             if (arr[i] < smallest) {
//                 smallest = arr[i];
//             }
//         }

//         System.out.println("Largest = " + largest);
//         System.out.println("Smallest = " + smallest);
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         boolean found = false;

//         for (int i = 0; i < n; i++) {

//             if (arr[i] == key) {
//                 System.out.println("Element found at index: " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Element not found");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         int[] numbers = {10, 20, 30, 40, 50};

//         int sum = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             sum = sum + numbers[i];
//         }

//         double average = (double) sum / numbers.length;

//         System.out.println("Sum = " + sum);
//         System.out.println("Average = " + average);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         int[] numbers = {10, 15, 22, 33, 40, 51};

//         int even = 0;
//         int odd = 0;

//         for (int i = 0; i < numbers.length; i++) {

//             if (numbers[i] % 2 == 0) {
//                 even++;
//             } else {
//                 odd++;
//             }
//         }

//         System.out.println("Even numbers = " + even);
//         System.out.println("Odd numbers = " + odd);
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int[] numbers = {10, 20, 30, 40, 50};

//         System.out.print("Enter number to search: ");
//         int search = sc.nextInt();

//         boolean found = false;

//         for (int i = 0; i < numbers.length; i++) {

//             if (numbers[i] == search) {
//                 System.out.println("Found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("Number not found");
//         }
//     }
// }