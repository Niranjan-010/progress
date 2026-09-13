// // public class Main {
// //     public static void main(String[] args) {

// //         int[] numbers = {10, 20, 30, 40, 50};

// //         for (int i = 0; i < numbers.length; i++) {
// //             System.out.println(numbers[i]);
// //         }
// //     }
// // }

// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter elements:");

// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         System.out.println("Array elements:");

// //         for (int i = 0; i < n; i++) {
// //             System.out.print(arr[i] + " ");
// //         }
// //     }
// // }

// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter elements:");

// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         int largest = arr[0];
// //         int smallest = arr[0];

// //         for (int i = 1; i < n; i++) {

// //             if (arr[i] > largest) {
// //                 largest = arr[i];
// //             }

// //             if (arr[i] < smallest) {
// //                 smallest = arr[i];
// //             }
// //         }

// //         System.out.println("Largest = " + largest);
// //         System.out.println("Smallest = " + smallest);
// //     }
// // }
// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter elements:");

// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         System.out.print("Enter element to search: ");
// //         int key = sc.nextInt();

// //         boolean found = false;

// //         for (int i = 0; i < n; i++) {

// //             if (arr[i] == key) {
// //                 System.out.println("Element found at index: " + i);
// //                 found = true;
// //                 break;
// //             }
// //         }

// //         if (!found) {
// //             System.out.println("Element not found");
// //         }
// //     }
// // }

// // public class Main {
// //     public static void main(String[] args) {

// //         int[] numbers = {10, 20, 30, 40, 50};

// //         int sum = 0;

// //         for (int i = 0; i < numbers.length; i++) {
// //             sum = sum + numbers[i];
// //         }

// //         double average = (double) sum / numbers.length;

// //         System.out.println("Sum = " + sum);
// //         System.out.println("Average = " + average);
// //     }
// // }

// // public class Main {
// //     public static void main(String[] args) {

// //         int[] numbers = {10, 15, 22, 33, 40, 51};

// //         int even = 0;
// //         int odd = 0;

// //         for (int i = 0; i < numbers.length; i++) {

// //             if (numbers[i] % 2 == 0) {
// //                 even++;
// //             } else {
// //                 odd++;
// //             }
// //         }

// //         System.out.println("Even numbers = " + even);
// //         System.out.println("Odd numbers = " + odd);
// //     }
// // }
// // import java.util.Scanner;

// // public class Main {
// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         int[] numbers = {10, 20, 30, 40, 50};

// //         System.out.print("Enter number to search: ");
// //         int search = sc.nextInt();

// //         boolean found = false;

// //         for (int i = 0; i < numbers.length; i++) {

// //             if (numbers[i] == search) {
// //                 System.out.println("Found at index " + i);
// //                 found = true;
// //                 break;
// //             }
// //         }

// //         if (!found) {
// //             System.out.println("Number not found");
// //         }
// //     }
// // }

// // import java.util.*;
// // public class array{
// //     public static void main(String [] args)
// //     {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("enter value of n");
// //         int n = sc.nextInt();
// //         int [] num = new int[n];
// //         System.out.println("enter the elements of array");
// //         for(int i=0;i<n;i++)
// //         {
// //             num[i] = sc.nextInt();
// //         }
// //         System.out.println("enter the number you want to search in array");
// //          int x = sc.nextInt();
// //         for(int i=0;i<n;i++)
// //             {
// //                 if(num[i]==x)
// //                 {
// //                     System.out.println("Number found at index "+i);
// //                      break;
// //                 }
// //             }
// //              System.out.println("sorry not found ");
// //     }
// // // }
// // import java.util.*;
// // class array{
// //     public static void main(String [] args)
// //     {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("enter value of n");
// //         int n = sc.nextInt();
// //         int [] num = new int[n];
// //         System.out.println("enter the elements of array");
// //         for(int i=0;i<n;i++)
// //         {
// //             num[i] = sc.nextInt();
// //         }
// //         int max = num[0];
// //         int min = num[0];
// //         for(int i=0;i<n;i++)
// //             {
// //                if(num[i] > max)
// //                {
// //                 max = num[i];
// //                }
// //                if(num[i] < min)
// //                 {
// //                 min = num[i];
// //                 }
// //     }
// //     System.out.println("maximum number in array is "+max);
// //     System.out.println("minimum number in array is "+min);
// //     }
// // }
// //  import java.util.*;
// // public class array{
// //     public static void main(String [] args)
// //     {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("enter value of row");
// //         int r = sc.nextInt();
// //          System.out.println("enter value of column");
// //         int c = sc.nextInt();
// //         int [][] num = new int[r][c];
// //         System.out.println("enter the elements of array");
// //         for(int i=0;i<r;i++)
// //         {
// //             for(int j = 0; j<c;j++)
// //             {
// //             num[i][j] = sc.nextInt();
// //             }
// //         }
// //         System.out.println("enter the number you want to search in array");
// //          int x = sc.nextInt();
// //         for(int i=0;i<r;i++)
// //             {
// //                 for(int j = 0; j<c;j++)
// //                 {
// //                 if(num[i][j]==x)
// //                 {
// //                     System.out.println("Number found at index  ["+i+"]["+j+"]");
// //                      break;
// //                 }
// //             }
// //         }
// //              System.out.println("sorry not found ");
// //     }
// //  }
// import java.util.*;
// public class array {
//    public static void main(String args[]) 
//    {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();
//       int matrix[][] = new int[n][m];
//       for(int i=0; i<n; i++) 
//         {
//            for(int j=0; j<m; j++)
//              {
//                matrix[i][j] = sc.nextInt();
//            }
//       }
//       System.out.println("The transpose is : ");
//       //To print transpose
//       for(int j=0; j<m ;j++) 
//         {
//           for(int i=0; i<n; i++) 
//             {
//               System.out.print(matrix[i][j]+" ");
//           }
//           System.out.println();
//       }
//    }
// }
