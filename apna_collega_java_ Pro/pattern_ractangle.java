public class pattern_ractangle 
{
 public static void hello(int rows,int cols)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
        {
            if(i==1 || i==rows || j==i || j==cols)
        {
            System.out.print("*");
        }
        else
        {
           System.out.print(" ");
        }
        }

           System.out.println();
        }
      
    } 
    public static void main(String [] args)
   
  {
   hello(4,5);
   }

} 
