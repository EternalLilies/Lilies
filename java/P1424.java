import java.util.Scanner;

public class P1424 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt(),n=in.nextInt(),km=0;
        if(x<6)
        {
            if(x+n<6)km=n*250;
            else if(x+n<8)km=(6-x)*250;
            else
            {
                n=n+x-8;
                km=(6-x)*250+(n/7)*1250;
                n%=7;
                if(n<6)km+=n*250;
                else km+=1250;
            }
        }
        else
        {
            if(x+n>7)
            {
                n=n+x-8;
                km=(n/7)*1250;
                n%=7;
                if(n<6)km+=n*250;
                else km+=1250;
            }
        }
        System.out.println(km);
        in.close();
    }
}
