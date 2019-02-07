package fr.project_j2ee.entity;

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
	
	public User(Long id, String username, String password, String firstName, String lastName, String phone, String email, String adresse, Boolean estAdmin) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.adresse = adresse;
		this.estAdmin = estAdmin;
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
		return email;
	}
	
	public Boolean getAdmin() {
		return estAdmin;
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
}
