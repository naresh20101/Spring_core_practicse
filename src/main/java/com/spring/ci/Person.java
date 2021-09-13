package com.spring.ci;

import java.util.List;

public class Person {
 private String name;
 private int personId;
 private List<String> district;
 private Certi certi;
public Person(String name, int personId, Certi certi, List district) {
	super();
	this.name = name;
	this.personId = personId;
	this.certi=certi;
	this.district=district;
}
@Override
public String toString() {
	return this.name+": "+ this.personId+"{"+this.certi.name+"}"+ this.district;
			
	
	
}

}
