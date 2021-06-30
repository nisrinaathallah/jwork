/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//class database connection//
public class DatabaseConnection {

    /**
     * method connection untuk menyambungkan ke postgre
     * @return koneksi menuju postgre sql
     */
    public static Connection connection(){
        Connection c = null;
        String db_name = "nisrina_jwork";
        String db_user = "postgres";
        String db_password = "postgres";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }

}
