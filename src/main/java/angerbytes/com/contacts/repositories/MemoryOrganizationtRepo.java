package angerbytes.com.contacts.repositories;

import angerbytes.com.contacts.domains.models.Organization;
import angerbytes.com.contacts.repositories.interfaces.OrganizationRepository;

import java.util.*;

public class MemoryOrganizationtRepo implements OrganizationRepository {

    private final Map<UUID, Organization> organizations = new HashMap<>();

    @Override
    public Organization saveOrg(Organization org) {
        organizations.put(org.getId(), org);
        return org;
    }

    @Override
    public Optional<Organization> findById(UUID id) {
        return Optional.ofNullable(organizations.get(id));
    }

    @Override
    public List<Organization> findAll() {
        return new ArrayList<>(organizations.values());
    }

    @Override
    public void deleteById(UUID id) {
        organizations.remove(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return organizations.containsKey(id);
    }
}
