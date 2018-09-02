package de.alexanderkaden.mypetclinic.services.map;

import de.alexanderkaden.mypetclinic.model.Owner;
import de.alexanderkaden.mypetclinic.services.OwnerService;

import java.util.Optional;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        Optional<Owner> result = this.findAll().stream().filter(obj -> obj.getLastName().equalsIgnoreCase(lastName)).findFirst();
        return result.orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
