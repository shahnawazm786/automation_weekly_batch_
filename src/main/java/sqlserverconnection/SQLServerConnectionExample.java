package sqlserverconnection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnectionExample {
    static Connection connection;
    public static void main(String[] args) {
        try{
            String dbURL="jdbc:sqlserver://KHADIJA\\SQLEXPRESS;databaseName=ERP_DB;integratedSecurity=true";
            String username="sa";
            String password="1234";
            //connection= DriverManager.getConnection(dbURL,username,password);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(dbURL);
            if(connection!=null){
                DatabaseMetaData metaData=connection.getMetaData();
                System.out.println(metaData.getDriverName());
                System.out.println(metaData.getDriverVersion());
                System.out.println(metaData.getDatabaseProductName());
                System.out.println(metaData.getDatabaseProductVersion());
            }
        }catch(SQLException se){
            se.printStackTrace();
        }
        catch (ClassNotFoundException cfe){
            cfe.printStackTrace();
        }
        finally {
            try{
                if(connection!=null){
                    connection.close();
                }

            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
