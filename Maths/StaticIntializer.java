import java.util.Scanner;

public class StaticIntializer {
    static{
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        area(b, h);
    }

    public static void area (int b, int h){
        if(b<=0 || h <=0){
            System.out.println("Not found");
        } else{
            System.out.println(b*h);
        }
    };

    public static void main(String[] args) {
        area(0, 0);
    }
}
