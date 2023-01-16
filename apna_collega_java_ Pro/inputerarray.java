import java.util.*;
public class inputerarray 
{
    public static void main(String [] args)
    {
    int marks[] = new  int[100];
    System.out.println("Enter any Array elements :");
    Scanner sc=new Scanner(System.in);

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    marks[3] = sc.nextInt();
    marks[4] = sc.nextInt();

    
    System.out.println("Eng  = "+marks[0]);
    System.out.println("Math  = "+marks[1]);
    System.out.println("Phy  = "+marks[2]);
    System.out.println("Chem  = "+marks[3]);
    System.out.println("Hin := "+marks[4]);

    marks[4]=100;
    System.out.println("Update = "+marks[4]);

    marks[3]=marks[3]+1;
    System.out.println("NEW = "+marks[3]);

    int sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
    int  s=sum/5;
    System.out.println("The Sum is = "+sum);
    System.out.println("The Percentage is = "+s);

    }
    
}
