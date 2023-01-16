public class LinearSearch 
{
 public static int LinearSearch(int numbers[],int key)
 {
    for(int i=0;i<numbers.length;i++)
    {
     if(numbers[i]==key) 
     {
        return i;
     }    
    }
    return -1;
 }    
 public static void main(String [] args)
 {
    int numbers[]={1,20,44,55,56,95,120,236,950};
    int key=120;
    int index=LinearSearch(numbers,key);
    if(index==-1)
    {
        System.out.println("Key Not Found...!!!");
    }
    else
    {
      
        System.out.println("The Key is = "+index);
    }
 }
}
