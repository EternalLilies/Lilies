package homework2;
import java.time.LocalDateTime;

public class TestClock {
    public static void main(String[] args) throws InterruptedException {
        // 使用Java的LocalTime获取当前系统的时间
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        // 使用当前系统的时间构造MyTime类型的对象
        MyTime myTime = new MyTime(hour, minute, second);
        while(true){
            // 使用ANSI转义序列控制终端文本仅在同一行输出，\033[2k就是这样功能的转义序列
            System.out.print("\033[2k\r" + myTime);
            // 通过Thread.sleep函数让incrementSecond方法每隔1000ms调用一次
            Thread.sleep(1000);
            myTime.incrementSecond();
        }
    }
}
