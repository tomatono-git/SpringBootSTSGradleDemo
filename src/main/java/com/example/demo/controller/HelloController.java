package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.neo4j.Person;
import com.example.demo.json.DemoJson;
import com.example.demo.service.DemoService;

@RestController
public class HelloController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@Autowired
    private DemoService service;


    @RequestMapping("/")
    @ResponseBody
    public DemoJson index() {

    	DemoJson entity = new DemoJson();
    	entity.text = "test_text";
    	entity.number = 1234567890;
    	entity.date = new Date();
    	entity.ignoreField = "ignore field";

//    	String response = "Greetings from Spring Boot!";
//    	LOGGER.debug("path={}, response={}", "/", response);
    	LOGGER.info("path={}, entity={}", "/", entity);

        return entity;
    }

    @RequestMapping("/demo/jsonTest")
    @ResponseBody
    public DemoJson demoJsonTest() {

    	DemoJson entity = new DemoJson();
    	entity.text = "test_text";
    	entity.number = 1234567890;
    	entity.date = new Date();
    	entity.ignoreField = "ignore field";

//    	String response = "Greetings from Spring Boot!";
//    	LOGGER.debug("path={}, response={}", "/", response);
    	LOGGER.info("path={}, entity={}", "/demo/jsonTest", entity);

        return entity;
    }

    @RequestMapping("/jsonTest")
    @ResponseBody
    public DemoJson jsonTest() {

    	DemoJson entity = new DemoJson();
    	entity.text = "test_text";
    	entity.number = 1234567890;
    	entity.date = new Date();
    	entity.ignoreField = "ignore field";

//    	String response = "Greetings from Spring Boot!";
//    	LOGGER.debug("path={}, response={}", "/", response);
    	LOGGER.info("path={}, entity={}", "/jsonTest", entity);

        return entity;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/demo/persons/{name}")
    @ResponseBody
    public DemoJson getPersonName(@PathVariable String name) {

    	// Keanu Reeves
    	LOGGER.info("name={}", name);

    	List<Person> list = this.service.findByName(name);
    	LOGGER.info("list={}", list.toArray());

    	DemoJson entity = new DemoJson();
    	entity.text = "getPersonName";
    	entity.number = 1234567890;
    	entity.date = new Date();
    	entity.ignoreField = "ignore field";

//    	String response = "Greetings from Spring Boot!";
//    	LOGGER.debug("path={}, response={}", "/", response);
    	LOGGER.info("path={}{}, entity={}", "/demo/persons/", name, entity);

        return entity;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/demo/persons")
    @ResponseBody
    public List<Person> getAllPersons() {

    	List<Person> list = this.service.findAll();
    	LOGGER.info("path={}, list={}", "demo/persons", list.toArray());

        return list;
    }

}
