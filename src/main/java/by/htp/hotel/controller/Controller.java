package by.htp.hotel.controller;

import by.htp.hotel.command.CommandAction;
import by.htp.hotel.command.CommandChoser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 10.06.2017.
 */
public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
        System.out.println("doGet");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
        System.out.println("doPost");
    }


    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String page = null;
        System.out.println(request.getParameter("action"));
        if (action != null) {
            CommandAction currentAction = CommandChoser.chooseAction(action);
            page = currentAction.execute(request, response);

            RequestDispatcher disp = request.getRequestDispatcher(page);
            disp.forward(request, response);

        }
    }
}
