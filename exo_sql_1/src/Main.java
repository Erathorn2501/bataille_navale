//package com.company;
//import com.company.BDConnection;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Etape 1
        String url = "jdbc:mysql://localhost:3306/cours1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "julien";
        String password = "";

        BDConnection test1 = new BDConnection(url, user, password); //Instanciation d'un objet Connection

        Connection connection = test1.Connection();//Etablissement d'une connecxtion (établissement de la connection)

        //Fin étape 1
        //Etape 2

        System.out.println("Veuillez renseigner votre Id : \n");//Récup de l'id du journaliste qui veut se connecter
        int nbResponse;
        nbResponse =sc.nextInt();//Récuperation de la valeur de l'id
        ReporterDao sessionJournaliste = new ReporterDao();
        Reporter reporter1 =  sessionJournaliste.readById(nbResponse, connection);

        //Fin étape 2

        /*Test d'affichage
        System.out.println("Journaliste identifié : " + reporter1.getPseudo());
        System.out.println("Id : " + reporter1.getId());
        System.out.println("Crédit : " + reporter1.getCredit());*/

        //Etape 3
        System.out.println("Souhaitez-vous ajouter un journaliste ? (1=oui/2=non)");
        nbResponse =sc.nextInt();

        if (nbResponse==1){
            String newJournaliste;
            int newId;
            int newCredit;

            System.out.println("Saisissez le nom du journaliste :");
            newJournaliste = sc.next();
            System.out.println("Saisissez l'id du journaliste :");
            newId = sc.nextInt();
            System.out.println("Saisissez le crédit du journaliste :");
            newCredit = sc.nextInt();

            //lancer méthode création journaliste (via objet)
            Reporter newReporter = new Reporter(newJournaliste, newCredit, newId);
            sessionJournaliste.create(newReporter);
        }


    }
}