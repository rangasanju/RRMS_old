package com.infyniteloop.rrms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infyniteloop.rrms.model.Users;


@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
	
	Users findByUsername(String username);

}
