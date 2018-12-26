import com.yimo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWired {
    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/autowired.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user.getCat().getName());
    }
}
