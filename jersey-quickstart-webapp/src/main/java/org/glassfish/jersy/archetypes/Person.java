package org.glassfish.jersy.archetypes;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	int age ;
	String name ;
	
	public int getAge()
	{
		return age ;
	}
	
	public String getName()
	{
		return name ;
	}
	public void setAge(int age)
	{
		 this.age=age ;
	}
	
	public void setName(String name)
	{
		this.name=name  ;
	}
}
