import java.util.*;
public class factorial
{
    public static void main(String[]args)
     {
       int num;
        System.out.print("Enter any positive integer:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
     {
        fact*=i;}
        
        System.out.println("Factorial: "+fact);
      }
    }
    