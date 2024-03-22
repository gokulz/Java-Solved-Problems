public class CountDigit{
    public static void main(String[] args) {
        //given the n count the digit of all
        int n = 1564566;

        int count=0;
       // int digit;
        while(n > 0 ){
            //extract the digit
            int digit = n %10;
            //count the digit
            count++;
            //divide the n to move to the other digit
            n = n/10;
        }

        System.out.println(count);
    }
}