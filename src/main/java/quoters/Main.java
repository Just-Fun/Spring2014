package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Serzh on 10/29/16.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
    }
}
