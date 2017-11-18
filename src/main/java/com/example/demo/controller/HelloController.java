package com.example.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.json.DemoJson;

@RestController
public class HelloController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

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
    	LOGGER.debug("path={}, entity={}", "/", entity);

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
    	LOGGER.debug("path={}, entity={}", "/", entity);

        return entity;
    }

}
