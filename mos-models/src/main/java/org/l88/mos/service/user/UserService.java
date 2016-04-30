package org.l88.mos.service.user;

import org.l88.mos.domain.user.Person;

public interface UserService {
	void addPerson(Person person);
	Person getPersonById(long id);
	void removePersonById(long id);
	void savePerson(Person person);
	Person[] listAllPersons();
}
