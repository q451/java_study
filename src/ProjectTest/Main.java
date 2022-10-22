package ProjectTest;

import java.util.Timer;

public class Main implements Runnable{
    Timer timer = new Timer();
    TimeTaskTest timeTaskTest = new TimeTaskTest();
    @Override
    public void run() {
//        timer.schedule(timeTaskTest,0,60*1000);//一分钟
        timer.schedule(timeTaskTest,0,1000);
    }

    public static void main(String[] args) {
        Main M = new Main();
        Thread thread = new Thread(M);
        thread.setName("1秒一次");
        thread.getName();
        thread.start();
    }
}
