package ProjectTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    public String showTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String time = simpleDateFormat.format(date);
        return time;
    }
}
