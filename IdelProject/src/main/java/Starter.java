import com.app.dao.DaoImpl;
import com.app.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: vpestov
 * Date: 3/11/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Starter {
    public static void main(String[] args){
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DaoImpl dao = (DaoImpl) context.getBean("dao");

        User u = new User();
        u.setUserName("userName");
        u.setUserPass("1111");
        u.setEmail("asdasdasdasd");
        dao.save(u);
    }
}
