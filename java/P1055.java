import java.util.Scanner;

public class P1055 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String isbn=in.nextLine();
        int sum=0,t=1;
        char[] ISBN=isbn.toCharArray();
        for(int i=0;i<12;i++)
        if(ISBN[i]!='-')
        {
            sum+=(ISBN[i]-'0')*t;
            t++;
        }
        sum%=11;
        if(sum==10)
        {
            if(ISBN[12]=='X')System.out.println("Right");
            else System.out.println(isbn.substring(0, 12)+"X");
        }
        else
        {
            if(ISBN[12]-'0'==sum)System.out.println("Right");
            else System.out.println(isbn.substring(0, 12)+sum);
        }
        in.close();
    }
}
