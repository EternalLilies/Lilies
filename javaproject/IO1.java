import java.util.*;

public class IO1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("你是什么垃圾？");
        String name = in.nextLine();
        System.out.println("你当垃圾几年了？");
        int age = in.nextInt();
        System.out.println("你好，" + name + "，明年你就当了" +  (age + 1) + "年垃圾，恭喜你！");
        in.close();
    }
}
