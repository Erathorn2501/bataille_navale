import java.sql.Connection;
import java.sql.*;

public class Reporter {
    private String pseudo;
    private int credit;
    private int id;

    public Reporter(){

    }

    public Reporter(String pseudo, int credit, int id){
        this.pseudo = pseudo;
        this.credit = credit;
        this.id = id;
    }

    //Remplacer attributs par objet reporter complété
    public void createReporter(String pseudo, int credit, int id, Connection myConn){
        //Préparation de la requête pour l'identification du journaliste
        String sqlRequest = "INSERT INTO news VALUES ('?', '?', '?');";

        //Ecriture de la requête
        try(PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)){
            preparedStatement.setInt(1,  id);
            preparedStatement.setString(2,  pseudo);
            preparedStatement.setInt(3,  credit);

            //Exécution de la requête
            preparedStatement.executeQuery();

        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "pseudo='" + pseudo + '\'' +
                ", credit=" + credit +
                ", id=" + id +
                '}';
    }
}
