import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import javax.persistence.*;
//import java.lang.module.Configuration;



import static org.junit.jupiter.api.Assertions.*;

public class HibernateBasicTest {

    final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");


    @Test
    void readId1() {

        EntityManager entityManager = emFactory.createEntityManager();
        //entityManager.find(News.class, )

        News news1 = entityManager.find(News.class, 1);
        System.out.println(news1);
        entityManager.close();

        }

    @Test
    void sessionOK2(){

        //entityManager.find(News,);
        EntityManager entityManager = emFactory.createEntityManager();
        assertTrue(entityManager.isOpen());

        entityManager.close();

    }


}