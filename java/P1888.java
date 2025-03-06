import java.util.Scanner;

public class P1888 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int max=a,min=a;
        max=(max<b)?b:max;
        max=(max<c)?c:max;
        min=(min>b)?b:min;
        min=(min>c)?c:min;
        c=gcd(max,min);
        System.out.println((min/c)+"/"+(max/c));
        in.close();
    }

    public static int gcd(int a,int b){
        int c=a;
        while(c!=0)
        {
            a=c;
            if(a<b)
            {
                c=a;
                a=b;
                b=c;
            }
            c=a%b;
        }
        return b;
    }
}
