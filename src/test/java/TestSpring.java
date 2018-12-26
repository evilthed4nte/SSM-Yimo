import com.yimo.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSpring {
    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        People people = ctx.getBean("people",People.class);

        System.out.println(Arrays.toString(people.getFriends()));
        System.out.println(people.getFriends().length);
        System.out.println(people.getCats());
        System.out.println(people.getFlowers());
        System.out.println(people.getUsers());
    }
}
