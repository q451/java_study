package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
定时完成一个任务
@Author:yangxiaoping
*/
class Test extends TimerTask{
    @Override
    public void run() {
        System.out.println("我是定时任务");
    }
    public void Say(){
        System.out.println(1111);
    }
}
public class TimerTest extends TimerTask {
    @Override
    public void run() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println("当前时间是： "+simpleDateFormat.format(date));
    }

    public static void main(String[] args) {
        TimerTest timerTest = new TimerTest();
        Timer timer = new Timer();//这个是执行定时任务的
        Test test = new Test();
        try {
            timer.schedule(timerTest,1000,2000);
            timer.schedule(test,1000,3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            timer.cancel();
        }
    }
}
