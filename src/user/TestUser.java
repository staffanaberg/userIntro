package user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestUser {



    @Test
    public void testCreateUser() {
        User myUser = new User("Hej", "Tjena");
    }

    @Test
    public void testGetUserName() {
        User myUser = new User("Hej", "Tjena");
        //Hämta userName ifrån objektet myUser
        String userName = myUser.getUserName();


        //Kontrollera att userName är "Hej"
        assertEquals("Hej", userName);
    }

    @Test
    public void testGetNormalUserName() {
        User myUser = new User("Staffan", "Tjena");
        //Hämta userName ifrån objektet myUser
        String userName = myUser.getUserName();

        //Kontrollera att userName är "Hej"
        assertEquals("Staffan", userName);
    }

    @Test
    public void testGetPassword() {
        User myUser = new User("Staffan", "Tjena");

        String password = myUser.getPassword();


        assertEquals("Tjena", password);
    }

    @Test
    public void testChangeUserName() {
        User myUser = new User("Staffan", "Tjena");

        myUser.setUserName("Snoopy");

        String actual = myUser.getUserName();

        String expected = "Snoopy";

        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordSmallAndCapitalLetters() {
        tddcicd.User user = new tddcicd.User("Staffan", "MySecretPassword");

        user.setPassword("hejhej#S");

        String expected = "hejhej#S";
        String actual = user.getPassword();


        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordOnlySmallLetters() {
        tddcicd.User user = new tddcicd.User("Staffan", "MySecretPassword");

        user.setPassword("hejhej#");

        String expected = "MySecretPassword";
        String actual = user.getPassword();


        assertEquals(expected, actual);
    }

    @Test
    public void testPasswordOnlyCapitalLetters() {
        tddcicd.User user = new tddcicd.User("Staffan", "MySecretPassword");

        user.setPassword("HEJHEJ#S");

        String expected = "MySecretPassword";
        String actual = user.getPassword();


        assertEquals(expected, actual);
    }


}
