package angerbytes.com.contacts.repositories.interfaces;

import angerbytes.com.contacts.domains.models.Organization;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrganizationRepository {

    Organization saveOrg(Organization org);
    Optional<Organization> findById(UUID id);
    List<Organization> findAll();
    void deleteById(UUID id);
    boolean existsById(UUID id);

}
