public class Tower{
    static int steps=0;
    public static void TowerOfHanoi(int n, String s , String h , String d){
       
     if(n == 1){
        steps++;
        System.out.println("Disk " + n +" is transferred from " + s + " to " + d );

        
        return;
     }
        TowerOfHanoi(n-1, s, d, h);
        steps++;
        System.out.println("Disk " + n +" is transferred from " + s + " to " + d);
        
        TowerOfHanoi(n-1, h, s, d);
       
    
    }
    public static void main(String args[]){
     int n =4;
     TowerOfHanoi(n, "src", "helper", "destination");
     System.out.println("Total steps = " + steps); // total steps=2^n -1

    }
}