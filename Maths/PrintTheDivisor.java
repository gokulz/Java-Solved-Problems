//import java.util.List;

public class PrintTheDivisor {
    public static void main(String[] args) {
        
        int n =36;

        printDiv(n);
    }

    //another method to print all the divisor

    public static void printDiv(int n){
        
        for(int i=1; i<=Math.sqrt(n); i++){
            
            if(n%i==0){
                System.out.println(i);
            } 
            if((n/i) !=i){
                System.out.println(n/i);
            }
        }
    }
   public static void printDiv2(int n){
    for(int i=1 ; i <=n; i++){
        if(n % i == 0){
            System.out.print(i + " ");
        }
    }
   }
   
   
}
