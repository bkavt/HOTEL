package by.htp.hotel.command;

import by.htp.hotel.Service.UserService;
import by.htp.hotel.Service.UserServiceImpl;
import by.htp.hotel.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static by.htp.hotel.util.ConstantValue.*;

public class StartAppCommand implements CommandAction {

    private UserService userService;

    public StartAppCommand() {
        userService= new UserServiceImpl();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        User user= new User();
        user.setName("Guest");
        user.setRole(0);
        
        List<User> users = userService.list();
        request.setAttribute("users", users);
        return PAGE_MAIN;
    }
}
