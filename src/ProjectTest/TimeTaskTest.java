package ProjectTest;
import java.util.TimerTask;

public class TimeTaskTest extends TimerTask {
    @Override
    public void run() {
        Task task = new Task();
        System.out.println("当前时间是："+task.showTime());
    }
}
