package app;

import fish.payara.cluster.Clustered;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@Clustered
@ApplicationScoped
public class RandomGenerator {
    private final int number = new Random().nextInt();

    int getNumber() {
        return number;
    }
}
