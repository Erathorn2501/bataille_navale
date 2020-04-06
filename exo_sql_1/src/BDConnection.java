import java.sql.*;

public class BDConnection {
    String url;
    String user;
    String password;

    Connection myConn;

    public BDConnection(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection Connection() {

        try{
            Connection myConn = DriverManager.getConnection(url,user,password);// factory : classe qui a pour role de créer les instances et les donner
            return myConn;

        } catch (SQLException e) {
            System.out.println("Connection échouée");
            return myConn;
            }


    }
}
