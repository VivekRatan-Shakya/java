import java.util.*;
//import math.util.*;
public class solution
{ 
public static void main(String[]args) 
{
int number;
 int choice;
 int evenSum=0;
 int oddSum=0;
do
{
  System.out.print("Enter the number ");
  Scanner sc=new Scanner(System.in);
  number=sc.nextInt();
 if(number%2==0) 
  {
    evenSum+=number;
  }
    else{oddSum+=number;
  }
  System.out.print("Do you want to continue? Press1 for yes or 0 for no");
  choice=sc.nextInt();
    
  }
while(choice==1);
System.out.println("Sum of even numbers: "+evenSum);
System.out.println("Sum of odd numbers: "+oddSum);
    
}
    
}
