package com.example.demo.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.example.demo.entity.neo4j.Person;

public interface PersonRepository extends GraphRepository<Person> {


	List<Person> findByName(String name);

}
