import java.util.Scanner;

public class P4414 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),n=0;
        if(a>b)
        {
            n=a;
            a=b;
            b=n;
        }
        if(a>c)
        {
            n=a;
            a=c;
            c=n;
        }
        if(b>c)
        {
            n=c;
            c=b;
            b=n;
        }
        String abc=in.next();
        for(int i=0;i<2;i++)
        {
            String one=abc.substring(i,i+1);
            switch (one) {
                case "A":
                    System.out.print(a);
                    break;
                case "B":
                    System.out.print(b);
                    break;
                case "C":
                    System.out.print(c);
                    break;
                default:
                    break;
            }
            System.out.print(" ");
        }
        String one=abc.substring(2,3);
            switch (one) {
                case "A":
                    System.out.print(a);
                    break;
                case "B":
                    System.out.print(b);
                    break;
                case "C":
                    System.out.print(c);
                    break;
                default:
                    break;
        }
        in.close();
    }
}
