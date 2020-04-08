import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPAUtility {
    private static final EntityManagerFactory emFactory;

    static {
        emFactory = Persistence.createEntityManagerFactory("com.company");
    }

    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    public static void close() {
        emFactory.close();
    }
}