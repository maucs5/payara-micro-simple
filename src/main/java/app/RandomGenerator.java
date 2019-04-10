package app;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ApplicationScoped
public class RandomGenerator {
    private final int number = new Random().nextInt();

    int getNumber() {
        return number;
    }
}
