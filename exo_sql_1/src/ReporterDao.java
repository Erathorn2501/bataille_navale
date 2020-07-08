import Beans.Reporter;

import java.sql.*;

public class ReporterDao {

    public Reporter readById(int id, Connection myConn) {

            //Préparation de la requête pour l'identification du journaliste
            String sqlRequest = "SELECT * FROM cours1.journaliste WHERE id = ?";

            //Ecriture de la requête
            try(PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)){
                preparedStatement.setInt(1,  id);

                //Exécution de la requête
                ResultSet rs = preparedStatement.executeQuery();
                Reporter reporter = new Reporter();
                //int i = 1;
                while (rs.next()) {
                    reporter.setId(rs.getInt(1));
                    reporter.setPseudo(rs.getString(2));
                    reporter.setCredit(rs.getInt(3));
                }
                // A titre de debug
                System.out.println(reporter);
                return reporter;

            }  catch (SQLException e) {
                e.printStackTrace();
                prepaCreate();
                return new Reporter("Mistake !", 0, 0);
            }
    }

    public void prepaCreate(){
        //Prépa des infos reporter
        Reporter reporter = new Reporter("nom_à_définir", 1,1);
        create(reporter);

    }

    public void create(Reporter reporter){
    //Gérer création journaliste
    }
}
