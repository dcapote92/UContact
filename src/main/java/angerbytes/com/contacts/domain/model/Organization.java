package angerbytes.com.contacts.domain.model;

import java.util.UUID;

public class Organization {
    private final UUID id;
    private String name;

    public Organization(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
