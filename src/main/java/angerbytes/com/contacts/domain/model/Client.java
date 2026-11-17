package angerbytes.com.contacts.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Client {
    private final UUID id;
    private String name;
    private List<Organization> orgs;

    public Client(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.orgs = new ArrayList<>();
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

    public List<Organization> getOrgs() {
        return orgs;
    }

    public void setOrgs(Organization org) {
        this.orgs.add(org);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
