public class binary_search 
{
  public static int inpute(int numbers[],int key)
{
    for(int i=0; i<numbers.length;i++)
    {
      if(numbers[i]==key)
      {
        return numbers[i];
      }
      if(numbers[i]<key)
      {
        numbers[i]=numbers[i]+1;
      }
      else
      {
       numbers[i]=numbers[i]-1;
      }
    }
    return -1;
}   
  public static void main(String[]args)
  {
    int numbers[]={4,5,6,3,8,9,45,50,55,77};
    int key=55;
    System.out.print(inpute(numbers,key));
  } 
}
