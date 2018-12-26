import com.yimo.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

public class TestAOP {

    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");


//        这是自己new 的所以不会有  不是容器管理的bean 那么织入行为无效
//        ProviderService providerService = new ProviderService();
        ProviderService providerService = ctx.getBean("providerService", ProviderService.class);
        providerService.add("头发");
    }
}
