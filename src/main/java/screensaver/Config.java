package screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Sergey on 12/27/16.
 */

@Configuration
@ComponentScan(basePackages = "screensaver")
public class Config {

    @Bean
    @Scope("periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ColorFrame colorFrame = null;
        int times = 100000;
        long before = System.nanoTime();
        for (int i = 0; i < times; i++) {
             colorFrame = context.getBean(ColorFrame.class);
        }
        long after = System.nanoTime();
        System.out.println((after - before) / times);
        System.out.println(colorFrame);


        /*while (true) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(200);
        }*/
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }
}
