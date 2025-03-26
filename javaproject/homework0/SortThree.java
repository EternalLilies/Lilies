package homework0;

import java.util.Scanner;

public class SortThree {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number:��");
        int a=in.nextInt();
        System.out.print("Enter second number:��");
        int b=in.nextInt();
        System.out.print("Enter third number:��");
        int c=in.nextInt();
        int temp=0;
        if(a<b)
        {
            temp=a;
            a=b;
            b=temp;
        }
        if(b<c)
        {
            temp=b;
            b=c;
            c=temp;
        }
        if(a<b)
        {
            temp=a;
            a=b;
            b=temp;
        }
        System.out.printf("%d %d %d",c,b,a);
        in.close();
    }
}
