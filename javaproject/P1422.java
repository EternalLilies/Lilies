import java.util.Scanner;

public class P1422 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int degree=in.nextInt();
        double money;
        if(degree<151)money=degree*0.4463;
        else if(degree<401)money=degree*0.4663-3;
        else money=degree*0.5663-43;
        System.out.printf("%.1f",money);
        in.close();
    }
}
