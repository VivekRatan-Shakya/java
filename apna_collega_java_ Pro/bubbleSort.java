// import java.util.*;
// public class bubbleSort{
//     public static void Sort(int arr[],int  n){
//         for(int i=0;i<n-1; i++){
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }  

//     public static void selection(int arr[],int n)
//     {
//         for(int i=0; i<n-1; i++)
//         {
//             int min = i;
//             for(int j=i+1; j<n; j++)
//             {
//                 if(arr[j] < arr[min])
//                 {
//                     min=j;
//                 }
//             }
//             int temp=arr[min];
//                     arr[min]=arr[i];
//                     arr[i]=temp;
//         }
//     }

//      public static void print(int arr[],int n){
//                 for(int i=0; i<n; i++)
//                 {
//                     System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//             }
    
//      public static void reverse(int arr[],int n){
//             int start =0;
//             int end = n-1;
//             while(start<end)
//             {
//                 int temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
//                 start++;
//                 end--;
//             }
//         }

//    public static void main(String args[]){
//     System.out.println("Enter the size of array");
//     Scanner sc=new Scanner(System.in);
//     int size =sc.nextInt();

//     System.out.println("Enter the elements of the array:");  
//     int[] array = new int[100];  
//     for(int i=0; i<size; i++)
//      {  
//         array[i]=sc.nextInt();  
//      }   
//     System.out.println("Sorted array");
//     Sort(array,size);
//     System.out.println("Selection sort");
//     selection(array,size);
//     print(array,size);
//     System.out.println("Sorted reverse array");
//     reverse(array,size);
//     print(array,size);
//  }

// }





// // public class bubbleSort{
// //     public static void bubbleSort(int arr[]){
// //        for(int turn=0; turn<arr.length-1;turn++){
// //             for(int j=0;j<arr.length-1-turn;j++){
// //                 if(arr[j]>arr[j+1]){
// //                     //swap
// //                     int temp=arr[j];
// //                     arr[j]=arr[j+1];
// //                     arr[j+1]=temp;
// //                 }
// //             }
// //         }
// //     }
// //     public static void PrintArr(int arr[]){
// //         for(int i=0; i<arr.length;i++){
// //             System.out.print(arr[i]+" ");
// //         }
// //         System.out.println();
// //     }
// //    public static void main(String[] args){
// //       int arr[]={5,4,1,3,2};
// //       bubbleSort(arr);
// //       PrintArr(arr);
// //     }    
// // }
  

