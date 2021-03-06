import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

        import static org.hamcrest.MatcherAssert.assertThat;
        import static org.hamcrest.core.Is.is;

public class UserDaoTest{
    @Test
    public void get() throws SQLException, ClassNotFoundException {
        Integer id = 1;
        String name = "hjlee";
        String password = "";

        UserDao userDao = new UserDao();
        User user = userDao.findById(id);
        assertThat(user.getId(), is(id));
        assertThat(user.getName(), is(name));
        assertThat(user.getPassword(), is(password));
    }
}