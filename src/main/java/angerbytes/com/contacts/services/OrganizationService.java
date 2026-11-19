package angerbytes.com.contacts.services;

import angerbytes.com.contacts.domains.models.Organization;
import angerbytes.com.contacts.repositories.interfaces.OrganizationRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrganizationService {
    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public Organization create(Organization org) {
        return repository.saveOrg(org);
    }

    public Optional<Organization> findById(UUID id){
        return repository.findById(id);
    }

    public List<Organization> findAll(){
        return repository.findAll();
    }

    public void delete(UUID id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Organization not found");
        }

        repository.deleteById(id);
    }
}
