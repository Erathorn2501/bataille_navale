//import java.sql.Date;
//import java.text.SimpleDateFormat;

import javax.persistence.*;

@Entity (name = "cours1")
@Table(name = "news")
public class News {

    /*A tester
    SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
    String dateString=sdf.format(date);
     */

    /*
    titre varchar(40)
    contenu varchar(150)
    date_creation datetime
    auteur varchar(20)
    facteur_confiance int
    tags varchar(100)
    id_news int PK
     */

    @Column(name = "titre")
    private String titre;
    @Column(name = "contenu")
    private String contenu;
    @Column(name = "date_creation")
    private String date_creation;
    @Column(name = "auteur")
    private String auteur;
    @Column(name = "facteur_confiance")
    private int facteur_confiance;
    @Column(name = "tags")
    private String tags;
    @Column(name = "id_news")
    private int id_news;


    public News(){

    }



    public News(String titre, String contenu, String date_creation, String auteur, int facteur_confiance, String tags, int id_news){

        this.titre = titre;
        this.contenu = contenu;
        this.date_creation = date_creation;
        this.auteur = auteur;
        this.facteur_confiance = facteur_confiance;
        this.tags = tags;
        this.id_news = id_news;

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getFacteur_confiance() {
        return facteur_confiance;
    }

    public void setFacteur_confiance(int facteur_confiance) {
        this.facteur_confiance = facteur_confiance;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getId_news() {
        return id_news;
    }

    public void setId_news(int id_news) {
        this.id_news = id_news;
    }

    @Override
    public String toString() {
        return "News{" +
                "titre='" + titre + '\'' +
                ", contenu='" + contenu + '\'' +
                ", date_creation='" + date_creation + '\'' +
                ", auteur='" + auteur + '\'' +
                ", facteur_confiance=" + facteur_confiance +
                ", tags='" + tags + '\'' +
                ", id_news=" + id_news +
                '}';
    }

    /*
    @Override
    public boolean equals(){

    }*/
}
