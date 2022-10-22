package MybatisProject.src.mybatisBase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
public class MybatisConfig {
    public static SqlSession getSqlSession(){
        InputStream inputStream = null;
        try {
            // 1.加载mybatis全局配置文件
            inputStream = Resources.getResourceAsStream("MybatisProject/resource/mappers/mybatis-config.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2.创建SqlSessionFactoryBuilder对象, 该对象表示SqlSessionFactory构造器, 用于创建SqlSessionFactory对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4.创建SqlSession对象，对数据库进行CRUD
        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;

    }
}
