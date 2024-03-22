import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisor2 {

    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<>();

        int n = 36;
//this loop is running for O(sqrt(n));
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                ls.add(i);
            } 
            if( (n/i) !=i){
                ls.add(n/i);
            }
        }
        Collections.sort(ls); //O(n log n)

        System.out.println(ls);
    }
    
}
