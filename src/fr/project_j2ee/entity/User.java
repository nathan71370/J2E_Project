package fr.project_j2ee.entity;

import java.util.List;

public class User {

	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String adresse;
	private Boolean estAdmin;
	private List<Picture> picture;
	
	public User() {
		
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Long getID() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public Boolean getAdmin() {
		return estAdmin;
	}
	
	public List<Picture> getPicture() {
		return picture;
	}
	
	public void setID(Long id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public void setAdmin(Boolean estAdmin) {
		this.estAdmin = estAdmin;
	}

	public void setPicture(List<Picture> picture) {
        this.picture = picture;
    }
}
