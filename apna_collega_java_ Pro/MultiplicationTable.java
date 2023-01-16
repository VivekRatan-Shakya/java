import.java.util.*;
class MultiplicationTable
{
  public static void printMultiplicationTable(int number)
{
     
     System.out.print("Enter number:");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     for(int i=1;i<=10;i++) 
            {
                System.out.println(n+" * "+i+" ="+n*i);
           }
    }
        