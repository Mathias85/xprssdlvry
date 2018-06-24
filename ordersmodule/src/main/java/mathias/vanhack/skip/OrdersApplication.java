package mathias.vanhack.skip;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"mathias.vanhack.skip"})
public class OrdersApplication {

    public static void main(String... args) {

        new AnnotationConfigApplicationContext(OrdersApplication.class);
    }
}
