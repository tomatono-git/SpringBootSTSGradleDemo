package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.neo4j.Person;
import com.example.demo.repository.PersonRepository;

@Service
//@EnableNeo4jRepositories(basePackages = "com.example.demo.repository")
//@Transactional(transactionManager="org.springframework.data.neo4j.transaction.Neo4jTransactionManager")
public class DemoServiceImpl implements DemoService {


    private final static Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Autowired
	private PersonRepository rersonRepository;

	@Override
	public List<Person> findByName(String name) {

		LOGGER.info("name={}", name);

		List<Person> personList = this.rersonRepository.findByName(name);
		return personList;
	}

	@Override
//	@Transactional(readOnly=true)
	public List<Person> findAll() {
		Iterable<Person> persons = this.rersonRepository.findAll();
		List<Person> personList = new ArrayList<>();
		persons.forEach(person -> {
			personList.add(person);
		});

		return personList;
	}
}
