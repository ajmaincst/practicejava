import java.util.Scanner;

class ForLoop {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int i,n,sum =0;
         System.out.println("Enter value of n<>=1x");
         n = sc.nextInt();
         System.out.println("N/t 1+2+3+4.....+N");
         System.out.println("................");
         for(i=1;i<=n;i++);
         sum=sum+i;
         System.out.println(i+"/t/t"+sum);
         }
     }

