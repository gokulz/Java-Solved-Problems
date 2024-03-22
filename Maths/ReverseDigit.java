public class ReverseDigit {
    public static void main(String[] args) {
          int n = 10400;
          //initialize the the reverse varibale
          int rev =0;

          while(n > 0){
             int lastDigit = n %10;
             rev = (rev *10) + lastDigit;
             n/=10;
          }


          System.out.println(rev);
    }


    
}
