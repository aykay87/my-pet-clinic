package de.alexanderkaden.mypetclinic.services;

import de.alexanderkaden.mypetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
