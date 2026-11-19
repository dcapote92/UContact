package angerbytes.com.contacts.repositories;

import angerbytes.com.contacts.domains.models.Client;
import angerbytes.com.contacts.repositories.interfaces.ClientRepository;

import java.util.*;

public class MemoryClientRepo implements ClientRepository {

    private final Map<UUID, Client> clients = new HashMap<>();

    @Override
    public Client saveClient(Client client) {
        clients.put(client.getId(), client);
        return client;
    }

    @Override
    public Optional<Client> findById(UUID id) {
        return Optional.ofNullable(clients.get(id));
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public void deleteById(UUID id) {
        clients.remove(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return clients.containsKey(id);
    }
}
