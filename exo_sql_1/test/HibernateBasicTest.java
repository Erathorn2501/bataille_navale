import Beans.News;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import javax.persistence.*;
//import java.lang.module.Configuration;



import static org.junit.jupiter.api.Assertions.*;

public class HibernateBasicTest {

    final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");

    //News newsToRemove = new News();
    int idToRemove = 3;

    @Test
    void readId1() {

        EntityManager entityManager = emFactory.createEntityManager();
        //entityManager.find(Beans.News.class, )

        News news1 = entityManager.find(News.class, 1);
        System.out.println(news1);
        entityManager.close();

        }

    @Test
    void sessionOK2(){

        //entityManager.find(Beans.News,);
        EntityManager entityManager = emFactory.createEntityManager();
        assertTrue(entityManager.isOpen());

        entityManager.close();

    }

    @Test
    void testInsert(){

        // EXEMPLE INSERT : INSERT into news values ("titre", "blabla", '2020-10-10', "Moi", 3, "tag1", 3);
        EntityManager entityManager = emFactory.createEntityManager();

        News newNews = new News("titre", "blabla", "2020-10-10", "Moi", 3, "tag1", 3);

        entityManager.createNativeQuery("INSERT INTO (titre, contenu, date_creation, auteur, facteur_confiance, tags, id_news) news VALUES (?,?,?,?,?,?,?)")
                .setParameter(1, newNews.getTitre())
                .setParameter(2, newNews.getContenu())
                .setParameter(3, newNews.getDate_creation())
                .setParameter(4, newNews.getAuteur())
                .setParameter(5, newNews.getFacteur_confiance())
                .setParameter(6, newNews.getTags())
                .setParameter(7, newNews.getId_news())
                .executeUpdate();

    }

    @Test
    void testInsert2(){

        EntityManager entityManager = emFactory.createEntityManager();

        News newNews = new News("titre", "blabla", "2020-10-10", "Moi", 3, "tag1", 3);

        entityManager.getTransaction().begin();
        entityManager.persist(newNews); //em.merge(u); for updates
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Test // FAIRE LE TEST SANS DATE AVEC JOURNALISTE
    void testInsert3(){

        EntityManager entityManager = emFactory.createEntityManager();

        News newNews = new News("titre", "blabla", "2020-10-10", "Moi", 3, "tag1", 3);

        entityManager.getTransaction().begin();
        entityManager.persist(newNews); //em.merge(u); for updates
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Test
    void testDelete(){

        EntityManager entityManager = emFactory.createEntityManager();

        News newsToRemove = entityManager.find(News.class, idToRemove);

        entityManager.getTransaction().begin();
        entityManager.remove(newsToRemove);
        entityManager.getTransaction().commit();

        //N'a pas marché pour le delete
        //Query query = session.creatQuery("DELETE news WHERE id_news = :id");
        //Query q = entityManager.createQuery("DELETE news WHERE id_news = :id");
        //Query query = entityManager.createQuery("DELETE news WHERE id_news = :id");
        //query.setParameter("id", id);
        //query.executeUpdate();

    }

}