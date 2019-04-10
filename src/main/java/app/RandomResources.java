package app;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("random")
public class RandomResources {
    @Inject
    RandomGenerator generator;

    @GET
    public int random() {
        return generator.getNumber();
    }
}
