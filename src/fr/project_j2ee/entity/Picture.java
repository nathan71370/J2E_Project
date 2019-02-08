package fr.project_j2ee.entity;

import java.util.Date;

public class Picture {
	
	private Long id;
	private String name;
	private String description;
	private String fileUser;
	private Date datePublish;
	private Category category;
	
	public Picture () {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getFileUser() {
		return fileUser;
	}
	
	public Date getDatePublish() {
		return datePublish;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setId(Long id) {
        this.id = id;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public void setDescription(String description) {
        this.description = description;
    }
	
	public void setFileUser(String fileUser) {
        this.fileUser = fileUser;
    }

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String toXml() {
        return "<product>\n" +
                "        <id>" + this.id + "</id>\n" +
                "        <name>" + this.name + "</name>\n" +
                "        <description>" + this.description + "</description>\n" +
                "        <fileUser>" + this.fileUser + "</fileUser>\n" +
                "        <datePublish>" + this.datePublish + "</datePublish>\n" +
                "    </product>\n";
    }

    public String toJson() {
        return "{\n" +
                "        \"id\":\"" + this.id + "\",\n" +
                "        \"name\":\"" + this.name + "\",\n" +
                "        \"description\":\"" + this.description + "\",\n" +
                "        \"fileUser\":\"" + this.fileUser + "\"\n" +
                "        \"datePublish\":\"" + this.datePublish + "\"\n" +
                "    }";
    }
}
