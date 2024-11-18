package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mi nombre es: ");
		builder.append(this.name);
		builder.append(" Mi apellido es: ");
		builder.append(this.surname);
		builder.append(" Pertenezco al squad: ");
		builder.append(this.squad);
		System.out.println(builder.toString());
	}
}
