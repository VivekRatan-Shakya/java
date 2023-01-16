import java.util.*;
public class bubbleSort{
    public static void bubbleSort(int arr[],int n){
        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void PrintBubble(int arr[],int n){
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void Inpute(int arr,int n){
        System.out.println("Enter the Size of Array:");{
            Scanner obj=new Scanner(System.in);
            int size=obj.nextInt();
            System.out.println("Enter The Array Elements:");
            int arr[]= new int[100];
            for(int i=0;i<size;i++){
            arr[i]=nextInt();
            }
        }
    }
    public static void main(String[]args){
        int n=arr.length;
        Inpute(arr,n);
        bubbleSort(arr,n);
        PrintBubble(arr n);

        
    }
}