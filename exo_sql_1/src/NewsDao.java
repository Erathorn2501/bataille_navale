//package com.company;

import java.sql.*;
import java.text.SimpleDateFormat;

public class NewsDao {

    public News readById(int id, Connection myConn) {

        //Préparation de la requête pour la lecture de la news par id
        String sqlRequest = "SELECT * FROM cours1.news WHERE id = ?";

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
            return new News("Mistake !", "retrouver le type d'erreur", "01/01/2020 00:00:00", "l'ordinateur", 10, "#master", 99);
        }

    }

    public void prepaCreateNews() {
        //Récup des infos
        //createNews();
    }

    public void createNews(String titre, String contenu, String date, String auteur, int facteur_confiance, String tags, int id_new, Connection myConn) {

        //Préparation de la requête pour la création de la news
        String sqlRequest = "INSERT INTO cours1.news VALUES (?, ?, ?, ?, ?, ?, ?)";

        //Ecriture de la requête
        try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {
            preparedStatement.setString(1, titre);
            preparedStatement.setString(2, contenu);
            preparedStatement.setString(3, date);
            preparedStatement.setString(4, auteur);
            preparedStatement.setInt(5, facteur_confiance);
            preparedStatement.setString(6, tags);
            preparedStatement.setInt(7, id_new);

            //Exécution de la requête
            ResultSet rs = preparedStatement.executeQuery();
            News news = new News();

            while (rs.next()) {
                //Vérif ce que rs renvoi lors d'une écriture

            }

            // A titre de debug
            System.out.println(news);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateNews(int numColumn, String varStr, int varInt, String condition, Connection myConn) {
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
                //Définir un renvoi
                break;
        }

        if (strRequest = true) {
            //Préparation de la requête pour la création de la news
            sqlRequest = "UPDATE news SET " + columnRequested + " = " + varStr + " WHERE " + condition;
        }
        else {
            //Préparation de la requête pour la création de la news
            sqlRequest = "UPDATE news SET " + columnRequested + " = " + varInt + " WHERE " + condition;
        }

            //Ecriture de la requête
            try (PreparedStatement preparedStatement = myConn.prepareStatement(sqlRequest)) {

                //Exécution de la requête
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    //Vérif ce que rs renvoi lors d'un update

                }

                // A titre de debug
                System.out.println("news updated");

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
