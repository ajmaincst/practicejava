import java.util.Scanner;
import java.util.WeakHashMap;

class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,res,div;
        System.out.println("Enter a number: ");
        n = input.nextInt();
        System.out.println("The number Reverse Order is :");

        do{
            res = n%10;
            System.out.println(""+res);
            div = n/10;
            n = div;
        } while(n!=0);
    }
}
