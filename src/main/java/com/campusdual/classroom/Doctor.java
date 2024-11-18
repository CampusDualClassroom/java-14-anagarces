package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
public void getDetails(){
		StringBuilder builder = new StringBuilder();
		builder.append("Mi nombre es: ");
		builder.append(this.name);
		builder.append(" Mi apellido es: ");
		builder.append(this.surname);
		builder.append(" Me especializo en: ");
		builder.append((this.specialization));
		System.out.println(builder.toString());
	}
}
