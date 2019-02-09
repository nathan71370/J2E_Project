package fr.project_j2ee.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table (name = "USERS")
@NamedQueries({
	@NamedQuery(name = "GetAllUsers", query = "SELECT u from Users u")
})
@XmlRootElement
public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String adresse;
	private Boolean estAdmin;
	@ManyToOne
	private List<Pictures> pictures;
	
	public Users() {
		
	}
	
	public Users(String username, String password) {
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
	
	public List<Pictures> getPictures() {
		return pictures;
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

	public void setPictures(List<Pictures> pictures) {
        this.pictures = pictures;
    }

	public String toXml() {
        return "<user>\n" +
                "        <id>" + this.id + "</id>\n" +
                "        <username>" + this.username + "</username>\n" +
                "        <firstName>" + this.firstName + "</firstName>\n" +
                "        <lastName>" + this.lastName + "</lastName>\n" +
                "        <phone>" + this.phone + "</phone>\n" +
                "        <email>" + this.email + "</email>\n" +
                "        <adresse>" + this.adresse + "</adresse>\n" +
                "    </user>\n";
    }

    public String toJson() {
    	return "{\n" +
                "        \"id\":\"" + this.id + "\",\n" +
                "        \"username\":\"" + this.username + "\",\n" +
                "        \"firstName\":\"" + this.firstName + "\",\n" +
                "        \"lastName\":\"" + this.lastName + "\"\n" +
                "        \"phone\":\"" + this.phone + "\"\n" +
                "        \"email\":\"" + this.email + "\"\n" +
                "        \"adresse\":\"" + this.adresse+ "\"\n" +
                "    }";
    }
}
