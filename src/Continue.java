import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

class Continue {
    public static void main(String[] args)throws IOException {
        int n = 0;
        String s;
        for (;;){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//?
            System.out.println("Enter a Positive number");
            s=br.readLine();
            n=Integer.parseInt(s);
            if(n<=0)
                continue;
            else
                break;
        }
        System.out.println("You have entered:"+n);
    }
}
