package homework0;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SortThreeByFile{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in=new Scanner(new File("C:\\code\\Lilies\\java\\in.txt"));
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
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
        System.out.printf("%d %d %d",a,b,c);
        in.close();
    }
}
