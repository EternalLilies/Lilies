package homework0;

public class Distance {
    public static void main(String[] args){
        int x=Integer.parseInt(args[0]),y=Integer.parseInt(args[1]);
        int d2=x*x+y*y;
        System.out.print(Math.sqrt((double)d2));
    }
}
