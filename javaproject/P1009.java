import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        BigInteger sum=new BigInteger("0");
        for(int i=1;i<=n;i++)
        sum=sum.add(factorial(i));
        System.out.print(sum);
        in.close();
    }

    public static BigInteger factorial(int number){
        BigInteger fsum=BigInteger.ONE;
        for(;number>0;number--)
        fsum=fsum.multiply(BigInteger.valueOf(number));
        return fsum;
    }
}
