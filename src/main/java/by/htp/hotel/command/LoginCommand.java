package by.htp.hotel.command;

import by.htp.hotel.Service.UserService;
import by.htp.hotel.Service.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static by.htp.hotel.util.ConstantValue.*;

/**
 * Created by User on 15.06.2017.
 */
public class LoginCommand implements CommandAction {
    private UserService userService;

    LoginCommand() {
        userService = new UserServiceImpl();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {





        return PAGE_MAIN;
    }
}
