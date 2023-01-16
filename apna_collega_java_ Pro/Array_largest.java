 import java.util.*;
 import java.lang.String;
public class Array_largest
// {
//   public static int Largest(int number[])
//   {
//     int largest=Integer.MIN_VALUE;
//      for(int i=0;i<number.length;i++)
//     {
//         if(largest<number[i])
//         {
//            largest=number[i];
//         }
//     }   
//         return largest;
    
//     }
//   public static void main(String[]args)
//   {
//     int number[]={1,2,3,4,15,6,7,80,9,};
//     System.out.println("Result is  = "+Largest(number));
   
//   }

// }




// import java.util.*;
// import java.lang.String;
// //public class String_key
{
    public static String list(String manu[],String key)
    {
        for(int i=0;i<manu.length;i++)
        {
        if(manu[i]==key)
        {
            return manu[i];
        }
    }
    return "-1"; // converting  to in String 
        
    }
    public static void main(String args [])
    {
        String manu[]={"Samusa","dosa","burgger","Patege","Chilli Patato","Kachaudi"};
        String key="dosa";
        System.out.println(list(manu,key));
    }
    
}


