package app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResources {
    @GET
    public String hello() {
        return "<h1>molly in the moll</h1>";
    }
}
