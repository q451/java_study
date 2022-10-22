package MybatisProject.src.test;

import MybatisProject.src.model.UserAccount;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;
import MybatisProject.src.mapper.UserAccountMapper;
public class UserAccountTest {
    public static void main(String[] args) {
        try {
            // 1.加载mybatis全局配置文件
            InputStream inputStream = Resources.getResourceAsStream("MybatisProject/resource/mappers/mybatis-config.xml");
            // 2.创建SqlSessionFactoryBuilder对象, 该对象表示SqlSessionFactory构造器, 用于创建SqlSessionFactory对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            // 3.创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            // 4.创建SqlSession对象，对数据库进行CRUD
            SqlSession sqlSession = sqlSessionFactory.openSession();
            // 5.执行相关方法
            UserAccountMapper mapper = sqlSession.getMapper(UserAccountMapper.class);

            List<UserAccount> list = mapper.getAllUsers();
            for (UserAccount user : list) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
