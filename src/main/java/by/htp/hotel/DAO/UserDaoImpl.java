package by.htp.hotel.DAO;

import by.htp.hotel.bean.User;
import by.htp.hotel.util.DbUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.htp.hotel.util.ConstantValue.*;

/**
 * Created by User on 20.06.2017.
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUserList() {
        Connection connection =null;
        List<User> list = new ArrayList<User>();
        try {
            if(connection==null||connection.isClosed()){
                connection = DbUtil.getConnection();
            }
            PreparedStatement ps =connection.prepareStatement(SQL_STATMENT_USER_LIST);
            ResultSet rs=ps.executeQuery();

            while (rs.next()){
                User user=new User();
                user.setLogin(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(5));
                user.setUserId(rs.getLong(1));
                list.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

       return list;
    }
}
