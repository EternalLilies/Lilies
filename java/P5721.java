import java.util.Scanner;

public class P5721 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),number=1;
        while(n>0)
        {
            for(int j=0;j<n;j++,number++)
            if(number<10)System.out.printf("0%d",number);
            else System.out.print(number);
            n--;
            System.out.print("\n");
        }
        in.close();
    }
}
