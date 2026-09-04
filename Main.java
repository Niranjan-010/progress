import java.util.*;
public class Main{
    public static void fact(int x){
        int facto = 1,i;
        for(i=x; i>=1;i--)
        {
            facto = facto * i;
        }
        System.out.print("fact="+facto);
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int num =sc.nextInt();
        fact(num);
    }
}
