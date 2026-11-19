package angerbytes.com.contacts.repositories.interfaces;

import angerbytes.com.contacts.domains.models.Client;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository {

    Client saveClient(Client client);
    Optional<Client> findById(UUID id);
    List<Client> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);


}
