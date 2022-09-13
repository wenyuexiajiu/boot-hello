package kw.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kw.boot.pojo.Person;
import kw.boot.service.PersonService;

@Controller
public class GreetingController {

	@Autowired
	private PersonService PersonService;
	
	@RequestMapping("/hello")
	@ResponseBody //返回json
	public List<Person> sayHello() {
		
		List<Person> list=PersonService.getPersonInfo();
		
		return list;//"今天开始学习SpringBoot框架了！";
	}
}
