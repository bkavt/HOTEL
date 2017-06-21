package by.htp.hotel.Service;

import by.htp.hotel.DAO.UserDao;
import by.htp.hotel.DAO.UserDaoImpl;
import by.htp.hotel.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 19.06.2017.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        userDao =new UserDaoImpl();
    }

    @Override
    public List<User> list() {
        List<User> list = new ArrayList<User>();
        User u1 = new User("user", "user", "user");
        User u2 = new User("use2", "user", "user");
        User u3 = new User("use3", "user", "user");
        User u4 = new User("user4", "user", "user");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);


        return userDao.getUserList();
    }
}
