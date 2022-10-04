package com.infinite.Jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable {
	
	public List<Employ>  showEmploy(){
	List<Employ> employList = new ArrayList<Employ>();
	employList.add(new Employ(1, "Gaurav", "Java","Developer",874356.34));
	employList.add(new Employ(2, "Harshit", "J2EE","Expert",8743556.44));
	employList.add(new Employ(3, "Swathi", "MySql","Programmer",873366.79));
	employList.add(new Employ(4, "Abhishek", "Angular","Tester",823323.34));
	employList.add(new Employ(5, "Sirisha", "React","Manager",898787.56));
	return employList;
}
}
