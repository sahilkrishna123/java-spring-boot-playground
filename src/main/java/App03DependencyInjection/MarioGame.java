package App03DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
    public void up() {
        System.out.println("JUMP");
    }

    public void down() {
        System.out.println("GO INTO A HOLE");
    }

    public void left() {
        System.out.println("GO BACK");
    }

    public void right() {
        System.out.println("ACCELERATE");
    }
}
