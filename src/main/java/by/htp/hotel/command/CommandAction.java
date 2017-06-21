package by.htp.hotel.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by User on 08.06.2017.
 */
public interface CommandAction {
    public String execute (HttpServletRequest request, HttpServletResponse response);
}
