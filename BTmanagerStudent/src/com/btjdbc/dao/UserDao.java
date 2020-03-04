package com.btjdbc.dao;

import com.btjdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Userconnect implements Iuser {
    private static final String jdbcUrl="jdbc:mysql://localhost:3306";
    private static final String jdbcUserName="root";
    private static final String jdbcPass="123456@Abc";
    private static final String insert_user_sql="insert into users (uname,email,country) values (?,?,?);";
    private static final String select_user_byid="select id,uname,email,country from users where id=?;";
    private static final String select_all_user="select *from users;";
    private static final String update_user_sql="update users uname=?,email=?,country=? where id=?;";
    private static final String delete_user_sql="delete from users where id=?;";
    public Userconnect(){

    }
    protected Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(jdbcUrl,jdbcUserName,jdbcPass);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(insert_user_sql);
        try ( Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(insert_user_sql)) {
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    @Override
    public User selectUser(int id) {
        User user=null;
        try (Connection connection=getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement(select_user_byid)){
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name =resultSet.getString("uname");
                String email =resultSet.getString("email");
                String country =resultSet.getString("country");
                user=new User(name,email,country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> userList=new ArrayList<>();
        try (Connection connection=getConnection();PreparedStatement preparedStatement=connection.prepareStatement(select_all_user)){
            System.out.println(preparedStatement);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("uname");
                String email=resultSet.getString("email");
                String country=resultSet.getString("country");
                userList.add(new User(id,name,email,country));
            }

        } catch (SQLException e) {
            printSQLException(e);
        }
        return userList;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete;
        try (Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(delete_user_sql)){
            preparedStatement.setInt(1,id);
            rowDelete=preparedStatement.executeUpdate()>0;
        }
        return rowDelete;
    }

    @Override
    public boolean updateUSer(User user) throws SQLException {
        boolean rowUpdate;
        try (Connection connection=getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(update_user_sql)){
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            rowUpdate = preparedStatement.executeUpdate()>0;
        }
        return rowUpdate;
    }
}
