package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.neo4j.Person;

public interface DemoService {

	List<Person> findByName(String name);

	List<Person> findAll();

}
