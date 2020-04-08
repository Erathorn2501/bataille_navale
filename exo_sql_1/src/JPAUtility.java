import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import java.util.Map;

public class JPAUtility {
    static final EntityManagerFactory emFactory;

    static {
        emFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");

        //emFactory = Persistence.createEntityManagerFactory("com.company");
    }

    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    public static void close() {
        emFactory.close();
    }

    public void testHibernate(){

    }



}