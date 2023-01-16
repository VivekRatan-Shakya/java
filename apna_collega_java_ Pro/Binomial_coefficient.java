public class Binomial_coefficient                                           //bc=a/b*c;  
{                             
  public static int factorial(int n)
  {
     int f=1;
     for(int i=1;i<=n;i++)
    {
        f=f*i;
       return f;
   }
 }
 public static int bc(int r,int n)
 {
    int  fact_n = factorial(n);
    int  fact_r = factorial(r);
    int  fact_nmr = factorial(n-r);

    int b = (fact_n/(fact_r*fact_nmr));
    return b;
 }
  public static void main(String [] args)
{
    //System.out.println(factorial(5));
     System.out.println(bc(10,2));
    
}
}

