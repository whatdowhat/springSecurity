package com.demo.dooho.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.dooho.domain.User;

public interface UsersRepository extends CrudRepository<User, Integer>{

}
