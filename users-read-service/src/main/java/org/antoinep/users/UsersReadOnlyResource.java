package org.antoinep.users;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersReadOnlyResource {

    private Set<User> users = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public UsersReadOnlyResource() {
        users.add(new User("Antoine", "POIRIER", 24));
        users.add(new User("Thibault", "POIRIER", 16));
    }

    @GET
    public Set<User> list() {
        return users;
    }
}