import java.util.Scanner; 
class SelectionSort { 
   
       public static void main(String[] args) { 
        int[] arr = {98,50,75,92,63};
        
        for(int i = 0; i < arr.length - 1;i++){
           int smallest = i;
           for(int j = i + 1; j < arr.length; j++){
               if( arr[j]  < arr[smallest] ){
                   smallest= j;
               }
               
           }
           int temp = arr[smallest];
               arr[smallest] = arr[i];
               arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + " "); 
        }
       
    }
}
