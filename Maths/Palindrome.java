public class Palindrome {
    public static void main(String[] args) {
        
        //check the given number is palindrome or not 
        int n = 121; 

        //initialize the rev
        int rev=0;

        int originalNumber =n;

        //iterate through the n
        while(n > 0){
        //extract the digit
        int lastDigit = n %10;
        //rev logic
        rev = (rev *10) + lastDigit;
        //move to next
        n/=10;
        }
        // check the rev and orignal with using if statement
        if(originalNumber == rev){
        //print yes else no
        System.out.println("Yes"); 
        } else{
            System.out.println("No");
        }
    }
    
}
