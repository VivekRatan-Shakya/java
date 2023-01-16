// public class reverse 
// {
//   public static void reverse(int number[])
//   {
//     int temp,start=0,end=number.length-1;    
//         for(int i=0;i<=number.length-1;i++)
//         {  //swappin code
//            temp=end;
//            end=start;
//            start=temp;   
           
//         }  
//         for(int j=end;j<=number.length-1;j--)
//         {
//            System.out.println(number[j]);
//         }
//       }
// public static void main(String[]args)
//   {
//     int number[]={1,2,3,4,5,6};
//     reverse(number);
//     //System.out.print(reverse(number));

//   }
// }
// //for(int j=start;j<=number.length;i++)








public class reverse 
{
  public static int reverse(int number[])
  {
    int temp,start=0,end=number.length-1;    
        for(int i=0;i<=number.length-1;i++)
        {  //swappin code
           temp=end;
           end=start;
           start=temp;   
           
        }  
        for(int j=end;j<=number.length-1;j--)
      {
        return number[j];
      }
      }
public static void main(String[]args)
  {
    int number[]={1,2,3,4,5,6};
   // reverse(number);
    System.out.print(reverse(number));
  //System.out.println(number[j]);

  }
}
//for(int j=start;j<=number.length;i++)