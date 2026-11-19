package angerbytes.com.contacts.services;

import angerbytes.com.contacts.domains.models.Client;
import angerbytes.com.contacts.repositories.interfaces.ClientRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClientService {
    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client create(Client client) {
        return repository.saveClient(client);
    }

    public Optional<Client> findById(UUID id){
        return repository.findById(id);
    }

    public List<Client> findAll(){
        return repository.findAll();
    }

    public void delete(UUID id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Client not found");
        }

        repository.deleteById(id);
    }
}
