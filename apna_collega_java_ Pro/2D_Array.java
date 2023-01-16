import java.util.Scanner;
// public class 2D_Array {
//     public static void inpute(int matrix[][]){
//         System.out.println("Enter The Matrix Elements:");{
//            Scanner obj=new Scanner(System.in);{
//                 for(int i=0;i<row;i++){
//                     for(int j=0;j<colum;j++){
//                         int matrix=obj.nextInt();
//                          System.out.println(" "+matrix[i][j]);
//                     }
//                 }    
//             }
//         } 
//         return 0;  
//     }           
//     public static void main(String[]args){
//          int matrix[][]=new int[7][7];
//          int row=matrix.length;
//          int colum=matrix.length;
//            inpute(7,7);

//     }
    
// }









public class 2D_Array
{
    public static void main(String[]args)
    {
        int matrix[][]=new int[7][7];
        int row=matrix.length;
        int colum=matrix.length;
        System.out.println("Enter The Matrix Elements:");
        Scanner obj=new Scanner(System.in);
                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<colum;j++)
                    {
                        int matrix=obj.nextInt();
                         System.out.println(matrix[i][j]);
                    }
                }    
            
        
    }
}   
    






