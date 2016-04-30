package org.l88.test.boot.mybatis1.controler;

import org.l88.mos.domain.user.Person;
import org.l88.mos.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class UserControler {

	@Autowired
	private UserService iuser;
	
	@RequestMapping("/{id}")
	public Person viewPerson(@PathVariable("id") Long id) {  
        return iuser.getPersonById(id);  
    }
	
	public Person[] listAllPersons(){
		return iuser.listAllPersons();
	}
}
