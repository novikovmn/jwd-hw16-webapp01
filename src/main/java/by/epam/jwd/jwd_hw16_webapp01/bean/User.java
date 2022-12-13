package by.epam.jwd.jwd_hw16_webapp01.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 2436618223537333592L;
	
	private String firstName;
	private String lastName;
	private int age;
	private String country;
	private String[] languages;

	public User() {

	}

	public User(String firstName, String lastName, int age, String country, String[] languages) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
		this.languages = languages;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(languages);
		result = prime * result + Objects.hash(age, country, firstName, lastName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(country, other.country) && Objects.equals(firstName, other.firstName)
				&& Arrays.equals(languages, other.languages) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", country=" + country
				+ ", languages=" + Arrays.toString(languages) + "]";
	}

	
	

}
