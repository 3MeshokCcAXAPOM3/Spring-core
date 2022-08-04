import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {AppConfig.class}
)
public class AppTest {
    @Autowired
    private ApplicationContext applicationContext;

    public AppTest() {
    }

    @Test
    public void mainTest() {
        HelloWorld tree = (HelloWorld)this.applicationContext.getBean(HelloWorld.class);
        HelloWorld leaf = (HelloWorld)this.applicationContext.getBean(HelloWorld.class);
        Cat one = (Cat)this.applicationContext.getBean(Cat.class);
        Cat two = (Cat)this.applicationContext.getBean(Cat.class);
        Assert.assertSame("Тест провален, не корректная настройка бина HelloWorld", tree, leaf);
        Assert.assertNotSame("Тест провален, не корректная настройка бина Cat", one, two);
    }
}
