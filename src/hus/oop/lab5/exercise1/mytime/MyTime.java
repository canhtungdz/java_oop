package hus.oop.lab5.exercise1.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;
    public MyTime() {}
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23 &&
            0 <= minute && minute <= 59 &&
            0 <= second && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid hour, minute or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String toString = "";
        if (hour<10) { toString += "0" + hour;}
        else {toString += hour;}
        if (minute<10) { toString += ":0" + minute;}
        else {toString += ":" + minute;}
        if (second<10) {toString += ":0" + second;}
        else {toString += ":" + second;}
        return toString;
    }
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }
    public MyTime previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            previousMinute();
        }
        return this;
    }
    public MyTime previousMinute() {
        minute--;
        if (minute == -1) {
            minute = 59;
            previousHour();
        }
        return this;
    }
    public MyTime previousHour() {
        hour--;
        if (hour == -1) {
            hour = 23;
        }
        return this;
    }

}
