package MybatisProject.src.mapper;

import MybatisProject.src.model.UserAccount;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserAccountMapper {
    List<UserAccount> getAllUsers();

    @Select("select * from user_account")
    List<UserAccount> getAllUsersInfo();
}
