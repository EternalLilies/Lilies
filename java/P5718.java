import java.util.Scanner;

public class P5718 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),min=1000;
        int[] Number=new int[n];
        for(int num:Number)
        {
            num=in.nextInt();
            min=(min>num)?num:min;
        }
        System.out.print(min);
        in.close();
    }
}
