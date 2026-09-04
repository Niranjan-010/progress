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

import java.util.*;
public class Main{
    public static void checkprime(int x)
    {
        int i,flag=0;
        if(x<2)
        {   
            System.out.println("not prime");
        }
        for(i=2;i<=x;i++)
        {
            if(x%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
        checkprime(num);
    }
}