//code for factorial

// import java.util.*;
// public class Main{
//     public static void fact(int x){
//         int facto = 1,i;
//         for(i=x; i>=1;i--)
//         {
//             facto = facto * i;
//         }
//         System.out.print("fact="+facto);
//         return;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number ");
//         int num =sc.nextInt();
//         fact(num);
//     }
// }

///code for multiplication table
// import java.util.*;
// public class Main{
//     public static void multitable(int x)
//     {
//         int i;
//         for(i=1;i<=10;i++)
//         {
//             System.out.println(x+"*"+i+"="+(x*i));
//         }
//         return;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number ");
//         int num =sc.nextInt();
//         multitable(num);
//     }
// }
//code for prime check

// import java.util.*;
// public class Main{
//     public static void checkprime(int x)
//     {
//         int i,flag=0;
//         if(x<2)
//         {   
//             System.out.println("not prime");
//         }
//         for(i=2;i<=x;i++)
//         {
//             if(x%i==0)
//             {
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==0)
//         {
//             System.out.println("prime");
//         }
//         else
//         {
//             System.out.println("not prime");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number ");
//         int num = sc.nextInt();
//         checkprime(num);
//     }
// }
///code for average of 3 number 

// import java.util.*;
// public class Main{
//     public static void average(int x, int y, int z)
//     {
//         System.out.println("average="+(x+y+z)/3);
//         return;
//     }
//     public static void main(String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any three number");
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         int c =sc.nextInt();
//         average(a,b,c);
//     }
// }
 
//code sum of all odd no from 1 to n 

// import java.util.*;
// public class Main{
//     public static void sumofodd(int x)
//     {
//         int sum=0,i;
//         for(i=1;i<=x;i++)
//         {
//             if(i%2!=0)
//             {
//                 sum += i;   
//             }
//         }
//         System.out.println("sum of odd from 1 to n = "+sum);
//         return;
//     }
//     public static void main(String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number");
//         int n = sc.nextInt();
//         sumofodd(n);
//     }
// }
//infinite loop 

// class Main{
//     public static void main(String[] args)
//     {
//         do 
//         {
//               System.out.println("hello");
//         }while(true);
//         }
//     }

// circumference of circle

// import java.util.*;
// public class Main{
//     public static void circumference(int r)
//     {
//         System.out.println("circumference of circle = "+(2*3.14*r));
//         return;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter radius of circle");
//         int radius = sc.nextInt();
//         circumference(radius);
//     }
// }        

//greatest of 3 number

// import java.util.*;
// public class Main{
//     public static void greatest(int x, int y, int z)
//     {
//         if(x>y && x>z)
//         {
//             System.out.println("greatest number is "+x);
//         }
//         else if(y>z)
//         {
//             System.out.println("greatest number is "+y);
//         }
//         else
//         {
//             System.out.println("greatest number is "+z);
//         }
//         return;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any three number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         greatest(a,b,c);
//     }
// }    

// //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int pos = 0;
//         int neg = 0;
//         int zero = 0;
//         char choice;

//         do {
//             System.out.print("Enter a number: ");
//             int x = sc.nextInt();

//             if (x > 0) {
//                 pos++;
//             } 
//             else if (x < 0) {
//                 neg++;
//             } 
//             else {
//                 zero++;
//             }

//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = sc.next().charAt(0);

//         } while (choice == 'y' || choice == 'Y');

//         System.out.println("Count of positive numbers = " + pos);
//         System.out.println("Count of negative numbers = " + neg);
//         System.out.println("Count of zeros = " + zero);
//     }
// }
//raise to the power of x to n

// import java.util.*;
// public class Main{
// public static void power(int x , int n)
// {
//     if(n==0)
//         {
//             System.out.println("value="+(Math.pow(x,n)));
//         }
//         else if(n>0)
//             {
//                 System.out.println("value="+(Math.pow(x,n)));
//             }
//             else
//             {
//                 System.out.println("value="+(Math.pow(x,n)));
//             }
//          return;
//         }
//         public static void main(String [] args)
//         {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("enter number and power");
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             power(a,b);
//         }
//     }

//CODE FOR fibonacii series uising function

// import java.util.*;
// public class Main{
//     public static void fibonacii(int n)
//     {
//         int a=0,b=1,c,i;
//         System.out.print(a+" "+b);
//         for(i=2;i<n;i++)
//         {
//             c=a+b;
//             System.out.print(" "+c);
//             a=b;
//             b=c;
//         }
//         return;
//     }
//     public static void main(String [] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number");
//         int num = sc.nextInt();
//         fibonacii(num);
//     }
//}
