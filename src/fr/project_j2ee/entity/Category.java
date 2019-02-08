package fr.project_j2ee.entity;

import java.util.List;

public class Category {
	
	private Long id;
	private String name;
	private List<Picture> picture;
	
	public Category() {
		
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Picture> getPicture() {
		return picture;
	}
	
	public void setId(Long id) {
        this.id = id;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public void setPicture(List<Picture> picture) {
        this.picture = picture;
    }
}
