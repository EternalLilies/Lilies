import java.util.*;

public class IO1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("����ʲô������");
        String name = in.nextLine();
        System.out.println("�㵱���������ˣ�");
        int age = in.nextInt();
        System.out.println("��ã�" + name + "��������͵���" +  (age + 1) + "����������ϲ�㣡");
        in.close();
    }
}
