package App02GamingAutoSpringBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("App02GamingAutoSpringBeans")
public class GamingAppLauncher {

    // Both of these beans are automatically created by Spring using @Component and @ComponentScan.\
    // There dependencies are also automatically injected
//    @Bean
//    public GamingConsole game(){
//        var game = new PacmanGame();
//        return game;
//    }
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {

            context.getBean(GameRunner.class).run();
        }
    }


}
