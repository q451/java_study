package MybatisProject.src.controller;

import MybatisProject.src.mapper.UserAccountMapper;
import MybatisProject.src.model.UserAccount;
import MybatisProject.src.mybatisBase.MybatisConfig;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class UserAccountController {

    public static void main(String[] args) {
        taskTime task = new taskTime();
        Timer timer = new Timer();
        timer.schedule(task,0,1000*60);
    }
}
class taskTime extends TimerTask{
    @Override
    public void run() {
        UserAccountMapper mapper = MybatisConfig.getSqlSession().getMapper(UserAccountMapper.class);
        List<UserAccount> list = mapper.getAllUsersInfo();
        for (UserAccount userAccount : list){
            System.out.println(userAccount);
        }
        //输出时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
