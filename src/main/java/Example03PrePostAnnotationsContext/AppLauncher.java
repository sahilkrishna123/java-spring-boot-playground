package Example03PrePostAnnotationsContext;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private Dependency dependency;

    public SomeClass (Dependency dependency){
        super();
        this.dependency = dependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct
    public void initialize(){
        dependency.getReady();
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleanup");
    }
}

@Component
class Dependency{
    public void getReady(){
        System.out.println("Some logic using Dependency class");
    }
}

@Configuration
@ComponentScan
public class AppLauncher {
    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(AppLauncher.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        }
    }
}
