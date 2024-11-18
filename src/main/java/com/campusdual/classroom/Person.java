package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("Mi nombre es: ");
		builder.append(this.name);
		builder.append(" Mi apellido es: ");
		builder.append(this.surname);
		System.out.println(builder.toString());
	}
}
