package angerbytes.com.contacts.repositories.interfaces;

import angerbytes.com.contacts.domains.models.Contact;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContactRepository {

    Contact saveContact(Contact contact);
    Optional<Contact> findById(UUID id);
    List<Contact> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);


}
