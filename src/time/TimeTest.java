package time;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTest {
    public static void main(String[] args) {
        Date data = new Date();
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR));
        DateFormat dataFormat = DateFormat.getDateInstance();
        DateFormat dateFormat1 = DateFormat.getDateTimeInstance();
        System.out.println("日期:"+dataFormat.format(data));
        System.out.println("日期和时间:"+dateFormat1.format(data));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println("具体时间"+simpleDateFormat.format(data));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println("时间戳"+simpleDateFormat1.format(data));
    }
}
