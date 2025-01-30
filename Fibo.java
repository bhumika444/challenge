import java.util.*;
public class Fibo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(range): ");
        int n=sc.nextInt();
        int first=0,second=1,next;
        System.err.println("Fibonacci series is: ");
        for(int i=0;i<=n;i++)
        {
            System.out.println(first+" ");
            next=second+first;
            first=second;
            second=next;
        }
    }
}