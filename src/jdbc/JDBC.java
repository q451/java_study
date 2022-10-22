package jdbc;

import java.sql.*;

public class JDBC {
//    public final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String URL = "jdbc:mysql://localhost:3306/javaspringboot?&useSSL=false&serverTimezone=UTC";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "123456";
    public static void main(String[] args) throws SQLException {
        JDBC jdbc = new JDBC();
        jdbc.deleteOne();

        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = connection.createStatement();

        String select = "select * from user_account";
        ResultSet resultSet = statement.executeQuery(select);
        System.out.println("id  userid  password");
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String userid = resultSet.getString(2);
            String password = resultSet.getString("password");
            System.out.println(id+"  "+userid+"  "+password);
        }
        statement.close();
        connection.close();

        System.out.println("#########################################");
        jdbc.PreStatement();
    }

    public void deleteOne(){
        try {
            Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statemeent = con.createStatement();

            String delete = "delete from user_account where id = 48";
            statemeent.executeUpdate(delete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void PreStatement(){
        try {
            Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
//            con.setAutoCommit(false);
            String select = "select * from user_account";
            String select1 = "select * from user_account where userid = ? or userid = ? ";

            PreparedStatement prepareStatement  = con.prepareStatement(select);
            PreparedStatement prepareStatement1  = con.prepareStatement(select1);

            ResultSet resultSet = prepareStatement.executeQuery();

            prepareStatement1.setString(1,"19301105");
            prepareStatement1.setString(2,"admin");
            ResultSet resultSet1 = prepareStatement1.executeQuery();
//            con.commit();
            while(resultSet.next()){
                System.out.println(resultSet.getString("userid")+"  "+ resultSet.getString("password"));
            }

            System.out.println("**************************************************");
            while(resultSet1.next()){
                System.out.println(resultSet1.getString("userid")+"  "+ resultSet1.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
