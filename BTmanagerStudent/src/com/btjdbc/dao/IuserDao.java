package com.btjdbc.dao;

import com.btjdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IuserDao {
     void insertUser(User user)throws SQLException;
     User selectUser(int id);
     List<User> selectAllUser();
     boolean deleteUser(int id) throws SQLException;
     boolean updateUSer(User user)throws SQLException;
}
