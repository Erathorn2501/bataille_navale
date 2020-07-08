package Old;

import java.sql.*;

public class Test {

    String url;
    String user;
    String password;

    public Test(String url, String user, String password){
        this.url = url;
        this.user = user;
        this.password = password;
    }

        public void methode() {

            try{
                Connection myConn = DriverManager.getConnection(url,user,password);// factory : classe qui a pour role de créer les instances et les donner
                Statement myStmt = myConn.createStatement(); // 2 type de stattement, 1 seul utilisé
                String sql = "select * from cours1.journaliste";//ifp = base de donnée et journaliste = nom de table
                ResultSet rs = myStmt.executeQuery(sql);

                while (rs.next())
                    System.out.println(rs.getString("pseudo"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
