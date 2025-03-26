package homework2;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
/*        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 0-59");
        } */
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    public MyTime(int hour) {
        this(hour, 0, 0);
    }

    public MyTime() {
        this(0, 0, 0);
    }

    public MyTime(MyTime time) {
        this(time.hour, time.minute, time.second);
    }

    public String toUniversalString() {
        String result = "";
        if(hour < 0 || hour >= 24 ) {
            result +=  "hour must be 0-23\n";
        }
        if(minute < 0 || minute >= 60) {
            result += "minute must be 0-59\n";
        }
        if(second < 0 || second >= 60) {
            result += "second must be 0-59\n";
        }
        if(result.length() > 0) {
            return result;
        }
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        int hourformat = hour % 12;
        String timeformat = (hour < 12) ? "AM" : "PM";
        if (hourformat == 0) {
            hourformat = 12;
        }
        return String.format("%02d:%02d:%02d %s", hourformat , minute, second, timeformat);
    }

    public void incrementHour() {
        hour = (hour + 1) % 24;
    }

    public void incrementMinute() {
        minute = (minute + 1) % 60;
        if (minute == 0) {
            incrementHour();
        }
    }

    public void incrementSecond() {
        second = (second + 1) % 60;
        if (second == 0) {
            incrementMinute();
        }
    }
}
