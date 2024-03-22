public class FibbonaciSeries{
    public static void main(String[] args) {
        int n =10;
        int firstTerm =0; 
        int secondTerm=1;

        for(int i=0; i<n; i++){
            System.out.println(firstTerm + " ");
            //comput the fibo
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}