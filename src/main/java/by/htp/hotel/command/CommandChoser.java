package by.htp.hotel.command;

import static by.htp.hotel.util.ConstantValue.*;

/**
 * Created by User on 08.06.2017.
 */
public class CommandChoser {
    public static CommandAction chooseAction(String action){
        switch (action){
            case ACTION_START_APP:{
                System.out.println("Start app " + action);
            return  new StartAppCommand();

            }
            case "dfd":{

            }
        }
        return  null;
    }
}
