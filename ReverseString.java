 
 import java.util.Scanner;

public class ReverseString{
   public static void RevStr(String str,int idx){
    if(idx==0){
        System.out.print(str.charAt(idx));
        return;
    }
     System.out.print(str.charAt(idx));
        RevStr(str, idx - 1);

   }


   public static void main(String[] args) {

       Scanner obj = new Scanner(System.in);
       String str = obj.nextLine();
       int idx=str.length() - 1;
       RevStr(str,idx);
        
   }
}