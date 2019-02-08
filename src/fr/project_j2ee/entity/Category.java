package fr.project_j2ee.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "CATEGORIES")
@NamedQueries({
        @NamedQuery(name = "GetAllCategories", query = "select c from Category c")
})
@XmlRootElement
public class Category implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "category")
	private List<Pictures> pictures;
	
	public Category() {
		
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Pictures> getPictures() {
		return pictures;
	}
	
	public void setId(Long id) {
        this.id = id;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public void setPicture(List<Pictures> pictures) {
        this.pictures = pictures;
    }
}
