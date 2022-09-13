package kw.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kw.boot.pojo.Person;

@Service
public class PersonService {

	public List<Person> getPersonInfo() {
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("100","张三","12345"));
		list.add(new Person("101","李四","111"));
		list.add(new Person("102","张三李四","666666"));
		return list;
	}
}
