public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        int originalNumber = n;
        int sum=0;

        while( n >0){
            int lastDigit = n %10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
            n/=10;
        }
        if(sum == originalNumber){
            System.out.println("It is Armstrong number");
        } else{
            System.out.println("It is not an amrstrong number");
        }

      //  System.out.println(sum);
    }
    
}
