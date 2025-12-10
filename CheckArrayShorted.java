public class CheckArraySorted{
  public static boolean isSorted(int arr[],int idx){

      if(idx==arr.length - 1){
        return true;
      }
       
      if(arr[idx]<arr[idx + 1]){

       return isSorted(arr, idx + 1);

         }
         else {
                return false;
            }
       }
 
   public static void main(String[] args) {

      int arr[]={1,2,3,4,4};
     int idx = 0;
     boolean res = isSorted(arr,idx);
     if(res){
     System.out.println("array is sorted");
}else{
       System.out.println("array is not sorted");
}

     }

}


