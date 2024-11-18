package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mi nombre es: ");
		builder.append(this.name);
		builder.append(" Mi apellido es: ");
		builder.append(this.surname);
		builder.append(" Pertenezco al área de: ");
		builder.append(this.area);
		System.out.println(builder.toString());
	}

}
