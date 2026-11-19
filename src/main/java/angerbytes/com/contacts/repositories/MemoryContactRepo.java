package angerbytes.com.contacts.repositories;

import angerbytes.com.contacts.domains.models.Contact;
import angerbytes.com.contacts.repositories.interfaces.ContactRepository;

import java.util.*;

public class MemoryContactRepo implements ContactRepository {

    private final Map<UUID, Contact> contacts = new HashMap<>();

    @Override
    public Contact saveContact(Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }

    @Override
    public Optional<Contact> findById(UUID id) {
        return Optional.ofNullable(contacts.get(id));
    }

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(contacts.values());
    }

    @Override
    public void deleteById(UUID id) {
        contacts.remove(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return contacts.containsKey(id);
    }
}
