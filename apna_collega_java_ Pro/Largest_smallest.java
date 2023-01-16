public class Largest_smallest{
    public static void LarSma(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(largest<arr[i]){
              largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
               
            }
            
        }
        System.out.println("Largest Number:"+largest);
        System.out.println("Smallest Number:"+smallest);
    }
   public static void main(String [] args){
        int arr[]={10,20,30,40,50,70,80};
        LarSma(arr);

        }
}


