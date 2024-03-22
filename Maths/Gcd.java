public class Gcd {
    public static void main(String[] args) {
        int a =20;
        int b=5;
            
        System.out.println(gcdAndHcf(a, b));

    }
    public static int gcdAndHcf(int a, int b){
        while(a >0 && b>0){
            if(a>b){
                a = a%b;
            } else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}
