
import org.junit.jupiter.api.Test;
import javax.persistence.*;
import static org.junit.jupiter.api.Assertions.*;

public class HibernateBasicTest {





    @Test
    void readId1() {

        //eManager.isOpen();
        //eManager.createQuery("SELECT * FROM news");
        //eManager.close();

        }

    @Test
    void sessionOK2(){

        final EntityManagerFactory emFactory;

        emFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");

        EntityManager entityManager = emFactory.createEntityManager();

        //entityManager.find(News,);

        assertTrue(entityManager.isOpen());

        entityManager.close();

    }


}