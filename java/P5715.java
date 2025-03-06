import java.util.Scanner;

public class P5715 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(),num;
        while(a<b||b<c)
        {
            if(a<b)
            {
                num=a;
                a=b;
                b=num;
            }
            if(b<c)
            {
                num=b;
                b=c;
                c=num;
            }
        }
        System.out.println(c+" "+b+" "+a);
        in.close();
    }
}
