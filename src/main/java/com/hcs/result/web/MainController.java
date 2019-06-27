package com.hcs.result.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcs.result.bean.Customer;

@Controller
public class MainController {
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	
//	@Autowired
//	private MongoTemplate mongoTemplate;

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String blog(Map<String, Object> model) {
		return "/blog/blog.html";
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/about/index")
	public String index(Map<String, Object> model) {
		return "/about/index.html";
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/customer")
	@ResponseBody	
	public String customer() {
		Customer tracker = new Customer();
		tracker.setUsername("test");
//		this.mongoTemplate.insert(tracker);
		
		return tracker.toString();
	}
	
	
   }

