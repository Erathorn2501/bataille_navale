//package com.company;

import java.sql.*;
import java.text.SimpleDateFormat;

public class NewsDao {

    public News readById(int id, Connection myConn) {

        //Préparation de la requête pour la lecture de la news par id
        String sqlRequest = "SELECT * FROM cours1.news WHERE id_news = ?";

        //Ecriture de la requête
        try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {
            preparedStatement.setInt(1, id);

            //Exécution de la requête
            ResultSet rs = preparedStatement.executeQuery();
            News news = new News();

            while (rs.next()) {
                news.setTitre(rs.getString(1));
                news.setContenu(rs.getString(2));
                news.setDate(rs.getString(3));
                news.setAuteur(rs.getString(4));
                news.setFacteur_confiance(rs.getInt(5));
                news.setTags(rs.getString(6));
                news.setId_news(rs.getInt(7));
            }
            // A titre de debug
            System.out.println(news);
            return news;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du SELECT");
            return new News("Mistake !", "retrouver le type d'erreur", "01/01/2020", "l'ordinateur", 10, "#master", 99);
        }

    }

    public void prepaCreateNews() {
        //Récup des infos
        //createNews();
    }

    public boolean createNews(News news, Connection myConn){
        //Préparation de la requête pour la création de la news
        String sqlRequest = "INSERT INTO cours1.news VALUES (\"?\", \"?\", \"?\", \"?\", ?, \"?\", ?);";

        //Ecriture de la requête
        try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {
            preparedStatement.setString(1, news.getTitre());
            preparedStatement.setString(2, news.getContenu());
            preparedStatement.setString(3, news.getDate_creation());
            preparedStatement.setString(4, news.getAuteur());
            preparedStatement.setInt(5, news.getFacteur_confiance());
            preparedStatement.setString(6, news.getTags());
            preparedStatement.setInt(7, news.getId_news());

            //Exécution de la requête
            preparedStatement.executeUpdate();

            // A titre de debug
            System.out.println("News créée");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du CREATE");
            return false;
        }


    }

    //executeupdate

    public boolean updateNews(int numColumn, String varStr, int varInt, String condition, Connection myConn) {
        String columnRequested;
        boolean strRequest;
        String sqlRequest;

        switch (numColumn) {
            case 1:
                columnRequested = "titre";
                strRequest = true;
                break;
            case 2:
                columnRequested = "contenu";
                strRequest = true;
                break;
            case 3:
                columnRequested = "date_creation";
                strRequest = true;
                break;
            case 4:
                columnRequested = "auteur";
                strRequest = true;
                break;
            case 5:
                columnRequested = "facteur_confiance";
                strRequest = false;
                break;
            case 6:
                columnRequested = "tags";
                strRequest = true;
                break;
            case 7:
                columnRequested = "id_news";
                strRequest = false;
                break;
            default:
                columnRequested = "";
                strRequest = false;
                //Définir un renvoi
                break;
        }

        //Préparation de la requête pour l'update de la news
        if (strRequest = true) {sqlRequest = "UPDATE news SET " + columnRequested + " = " + varStr + " WHERE " + condition;}
        else {sqlRequest = "UPDATE news SET " + columnRequested + " = " + varInt + " WHERE " + condition;}

            //Ecriture de la requête
            try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {

                //Exécution de la requête
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    //Vérif ce que rs renvoi lors d'un update

                }

                // A titre de debug
                System.out.println("news updated");
                return true;

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erreur lors de l'UPDATE (vérifiez l'orthogrpahe de votre requête, ainsi que vos droits d'utilisateurs)");
                return false;
            }

    }

    public boolean deleteNews(String condition, Connection myConn){
        //Préparation de la requête pour l'effacement de la news
        String sqlRequest = "DELETE FROM news WHERE " + condition;

        //Ecriture de la requête
        try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {

            //Exécution de la requête
            preparedStatement.executeQuery();

            // A titre de debug
            System.out.println("News effacée");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du DELETE");
            return false;
        }

    }
}
