import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;


class NewsDaoTest {

    private String url = "jdbc:mysql://localhost:3306/cours1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "julien";
    private String password = "";

    private BDConnection test1 = new BDConnection(url, user, password); //Instanciation d'un objet Connection

    Connection myConn = test1.Connection();//Etablissement d'une connecxtion (établissement de la connection)

    private News newsLorem = new News("titre1", "Lorem Ipsum", "2020-02-07 15:44:00", "michel", 4, "tag1, tag2", 1);
    private News fakeNews = new News("fake", "fake", "0000-00-00 00:00:00", "fake", 0, "fake", 999);
    private News newsTest = new News();
    //private News createNewsTest = new News("titre2", "Lorem2", "06/04/2020 14:21:00", "juju", 5, "tagTest", 2);
    private NewsDao newsDaoTest = new NewsDao();
    private boolean boolTest;

    @Test
    void readById1() {
        newsTest = newsDaoTest.readById(1, myConn);
        assertEquals(newsLorem.toString(), newsTest.toString(), "readById1 : OK");
    }

    @Test
    void readById2() {
        newsTest = newsDaoTest.readById(1, myConn);
        assertNotEquals(fakeNews.toString(), newsTest.toString(), "readById2-a : OK");
        assertFalse((fakeNews.toString().equals(newsTest.toString())), "readById2-b : OK");
    }

    @Test
    void createNews() { /*à changer*/
        boolTest = newsDaoTest.createNews("titre2", "Lorem2", "20-04-06", "juju", 5, "tagTest", 2, myConn);
        assertTrue(boolTest, "createNews1 : OK");
    }

    @Test
    void falseCreateNews(){
        boolTest = newsDaoTest.createNews("titre2", "Lorem2", "20-04-06", "juju", 5, "tagTest", 1, myConn);
        assertFalse(boolTest, "createNews2 : OK");
    }

    @Test
    void updateNews() { /*à changer*/
        boolTest = newsDaoTest.updateNews(1, "titre2", 0, "id_news=1", myConn);
        assertEquals(true, boolTest, "updateNews-a : OK");
        assertNotEquals(true, boolTest, "updateNews-a : pas OK");

    }

    @Test
    void deleteNews() {
        boolTest = newsDaoTest.deleteNews("id_news=2", myConn);
        assertTrue(boolTest, "deleteNews : OK");
    }
}