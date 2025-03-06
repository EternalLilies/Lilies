import java.util.Scanner;

public class P1909 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] number,price;
        number=new int[3];
        price=new int[3];
        int n=in.nextInt();
        for(int i=0;i<3;i++)
        {
            number[i]=in.nextInt();
            price[i]=in.nextInt();
            int a=n%number[i];
            number[i]=n/number[i];
            if(a!=0)number[i]++;
            price[i]*=number[i];
        }
        int min=price[0];
        for(int p:price)min=(min>p)?p:min;
        System.out.println(min);
        in.close();
    }
}
