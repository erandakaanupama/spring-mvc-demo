package com.eab.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sun.javafx.collections.MappingChange.Map;

public class Student {

	private String firstName;
	
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;
	private String favoriteLanguage;
	private String[] opereatingSystems;
//	private LinkedHashMap<String, String> radioOption;

	public Student() {
		this.countryOption = new LinkedHashMap();
		this.countryOption.put("sl", "Sri lanka");
		this.countryOption.put("ind", "India");
		this.countryOption.put("aus", "Australia");
		this.countryOption.put("jpn", "Japan");
		
//		this.radioOption = new LinkedHashMap<>();
//		this.radioOption.put("Linux", "Linux Os");
//		this.radioOption.put("Mac", "Mac Os");
//		this.radioOption.put("Win", "Windows");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public HashMap<String, String> getCountryOption() {
		return countryOption;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = "I love "+ favoriteLanguage;
	}

	public String[] getOpereatingSystems() {
		return opereatingSystems;
	}

	public void setOpereatingSystems(String[] opereatingSystems) {
		this.opereatingSystems = opereatingSystems;
	}

	/*public LinkedHashMap<String, String> getRadioOption() {
		return radioOption;
	}

	public void setRadioOption(LinkedHashMap<String, String> radioOption) {
		this.radioOption = radioOption;
	}*/
	
	

}
