import java.util.Scanner;

public class P5719 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();
        double A=0.0,B=0.0;
        int n1=n/k;
        A=(1+n1)/2.0*k;
        B=n*(n+1)*0.5-A*n1;
        B/=n-n1;
        System.out.printf("%.1f %.1f",A,B);
        in.close();
    }
}
