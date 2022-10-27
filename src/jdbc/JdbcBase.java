package jdbc;

import java.sql.*;
import java.util.List;

public class JdbcBase {
    public final static String URL = "jdbc:mysql://localhost:3306/javaspringboot?&useSSL=false&serverTimezone=UTC";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "123456";

    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;

    public static Statement getStatementConnection(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }

    public static PreparedStatement prepareConnection(String sql){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return preparedStatement;
    }

    public static boolean closeStatement(){
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static boolean closePreparedStatement(){
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static ResultSet selectOne(String tableName,int id){
        String sql = "select * from " +tableName +" where id = " + id;
        Statement statement1 = JdbcBase.getStatementConnection();
        ResultSet resultSet;
        try {
            resultSet = statement1.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
//            JdbcBase.closeStatement();
        }
        return resultSet;
    }
    public static void main(String[] args) throws SQLException {
        String table = "user_account";
        ResultSet res = JdbcBase.selectOne(table,45);
        while (res.next()){
            System.out.println("userid:"+res.getString("userid")+"   "+"password:"+res.getString("password"));
        }
    }
}
