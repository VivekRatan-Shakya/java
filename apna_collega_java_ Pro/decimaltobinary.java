import java.util.*;  //wrongh pro
import java.math.*;
public class decimaltobinary {
    
    int mynum=n;
    int pow=0;
    int binnum=0;

    while(n>0)
    {
     int rem=n/2;
     binnum=binnum+(rem*(int)math.pow(10,pow));
     pow++;
     n=n/2;
     System.out.println("Binary is: = "+binnum);
    }
}
public static void main(String [] args)
{
    decimaltobinary(10);
}
