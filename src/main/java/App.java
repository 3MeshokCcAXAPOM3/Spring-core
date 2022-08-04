import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(new Class[]{AppConfig.class});
        HelloWorld bean = (HelloWorld)applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld)applicationContext.getBean("helloworld");
        Cat beanCat = (Cat)applicationContext.getBean("whoSayGav");
        Cat beanCat2 = (Cat)applicationContext.getBean("whoSayGav");
        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(beanCat.getSayNotGaf());
        System.out.println(beanCat2.getSayNotGaf());
        System.out.println(bean2 == bean);
        System.out.println(beanCat == beanCat2);
    }
}