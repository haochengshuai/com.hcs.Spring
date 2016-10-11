package com.hcs.result.web;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcs.result.bean.Customer;

@Controller
public class MainController {
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
	
	@RequestMapping("/customer")
	@ResponseBody	
	public String customer() {
		Customer tracker = new Customer();
		tracker.setUsername("test");
		tracker.setId(1L);
		tracker.setAge(11);
		this.mongoTemplate.insert(tracker);
		
		return tracker.toString();
	}
	
	
   }

