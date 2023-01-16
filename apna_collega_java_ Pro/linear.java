public class linear {
 public static int LinearSearch(int arr[],int key){
          for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            {
                return arr[i]; 
            }
            }
            return -1;
          
        }
        public static void main(String[]args){
            int arr[]={4,5,6,7,8,9,1,0,20,30};
            int key=4;
        //   int index=(LinearSearch(arr,key));
          System.out.println(LinearSearch(arr,key));
          
        }
    }

