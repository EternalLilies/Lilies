import java.util.Scanner;

public class P5717 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        boolean flag=true;
        if(!(a+b>c && a+c>b && b+c>a))
        {
            System.out.println("Not triangle");
            flag=false;
        }
        else if(a*a+b*b<c*c || a*a+c*c<b*b || b*b+c*c<a*a)System.out.println("Obtuse triangle");
        else if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)System.out.println("Right triangle");
        else System.out.println("Acute triangle");
        if(flag)
        {
            if(a==b || a==c || b==c)System.out.println("Isosceles triangle");
            if(a==b && a==c)System.out.println("Equilateral triangle");
        }
        in.close();
    }
}
