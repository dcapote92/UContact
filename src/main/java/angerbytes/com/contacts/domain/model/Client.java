package angerbytes.com.contacts.domain.model;

import java.util.UUID;

public class Client {
    private final UUID id;
    private String name;

    public Client(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
