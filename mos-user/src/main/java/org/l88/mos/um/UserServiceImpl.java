package org.l88.mos.um;

import java.util.List;

import org.l88.mos.domain.user.Person;
import org.l88.mos.service.user.UserService;
import org.l88.mos.um.dao.UmbPersonMapper;
import org.l88.mos.um.domain.UmbPerson;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UmbPersonMapper persondao;
	
	@Override
	public void addPerson(Person person) {
		UmbPerson record = new UmbPerson();
		BeanUtils.copyProperties(person, record);
		persondao.insert(record);
		person.setId(record.getId());
	}

	@Override
	public Person getPersonById(long id) {
		return persondao.selectByPrimaryKey(id);
	}

	@Override
	public void removePersonById(long id) {
		persondao.deleteByPrimaryKey(id);
	}

	@Override
	public void savePerson(Person person) {
		UmbPerson record = new UmbPerson();
		BeanUtils.copyProperties(person, record);
		persondao.updateByPrimaryKeySelective(record );
	}

	@Override
	public Person[] listAllPersons() {
		List<UmbPerson> persons = persondao.selectByExample(null);
		return persons.toArray(new Person[]{});
	}

}
