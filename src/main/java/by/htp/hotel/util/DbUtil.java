package by.htp.hotel.util;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by User on 20.06.2017.
 */
public class DbUtil {
    static Connection connection = null;

    static {
        try {
            InitialContext ic = new InitialContext();

            DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/data_base_hotel");

            connection = ds.getConnection();

        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }


}
