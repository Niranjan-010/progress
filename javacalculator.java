// THis is my simple java calculator code// 
import java.util.*;
public class javacalculator{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("=====Welcome in java Calculator=====");
System.out.println("enter (+) for addition");
System.out.println("enter (-) for subtraction");
System.out.println("enter (/) for division");
System.out.println("enter (*) for multiplication");
System.out.println("enter (ln) for logarithm value of e base ");
System.out.println("enter (log) for log value of base 10");
System.out.println("enter (log2) for log value of base 2 ");
System.out.println("enter (s) for square  ");
System.out.println("enter (c) for cube");
System.out.println("enter (p) for power of your numbers ");
System.out.println("enter (e) for exponential ");
System.out.println("enter (sqrt) for square root ");
System.out.println("enter (cbrt) for cube root ");
System.out.println("enter (nrt) for your number root");
while(true)
{
System.out.println("Enter exit or continue");
String cho = sc.next();
    if (cho.equalsIgnoreCase("exit"))
         {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
    else
        {
System.out.println("enter num1");
double a = sc.nextDouble();
System.out.println("enter num2");
double b = sc.nextDouble();
System.out.println("enter which operation you want to do");
String ch = sc.next();
switch(ch)
{
case "+": 
System.out.println("add = "+ (a+b));
break;
case "-" :
     System.out.println("sub= " +(a-b));
break;
case "*":
    System.out.println("multiply= " +(a*b));
break;
case "/": 
if(b != 0)
{
System.out.println("division= "+(a/b));
}
else
{
System.out.println("Math error");
}
break;
case "ln":
    System.out.println("loge= "+(Math.log(a)));
break;
case "log":
    System.out.println("log10= "+(Math.log10(a)));
break;
case "log2":
    System.out.println("log2= "+(Math.log(a)/Math.log(2)));
break;
case "s":
    System.out.println("square= "+(Math.pow(a,2)));
break;
case "p":
     System.out.println("power= "+(Math.pow(a,b)));
break;
case "c": 
System.out.println("cube= "+(Math.pow(a,3)));
break;
case "e":
    System.out.println("exponential= "+(Math.exp(a)));
break;
case "sqrt":
    System.out.println("square root= "+(Math.sqrt(a)));
break;
case "cbrt" :
     System.out.println("cube root= "+(Math.cbrt(a)));
break;
case "nrt": 
System.out.println("nth root= "+(Math.pow(a,1.0/b)));
break;
default: 
System.out.println("Math error");
break;
}
}
}
sc.close();
}   
}
