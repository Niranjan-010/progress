code for factorial
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

code for multiplication table
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
code for prime check
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