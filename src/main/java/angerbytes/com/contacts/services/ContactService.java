package angerbytes.com.contacts.services;

import angerbytes.com.contacts.domains.models.Contact;
import angerbytes.com.contacts.repositories.interfaces.ContactRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ContactService {
    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact create(Contact contact) {
        return repository.saveContact(contact);
    }

    public Optional<Contact> findById(UUID id){
        return repository.findById(id);
    }

    public List<Contact> findAll(){
        return repository.findAll();
    }

    public void delete(UUID id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Contact not found");
        }

        repository.deleteById(id);
    }
}
