package App01GamingSpringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBeans {
    public static void main(String[] args){
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){

            System.out.println(context.getBean("game"));
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
