public class Binomial_coefficient                               //bc=a/b*c;
  public static int bio(int f,int n)
     for(int i=1;i<=n;i++)
    {
        f=f*i;
        {
            System.out.println("The Factorial is: ="+f);
        }
    }
 }
 public static int l(int r,int n)
 {
    int  n_fact=factorial(n);
    int r_fact=factorial(r);
    int nmr_fact=factorial(n-r);

   int bc=(n_fact/(r_fact*nmr_fact));
   return bc;
 }
{
   public static void main(String [] args)

   System.out.println("The result is: = "+bc);
    
}

