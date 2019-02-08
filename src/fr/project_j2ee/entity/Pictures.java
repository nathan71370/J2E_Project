package fr.project_j2ee.entity;

import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlTransient;

@SuppressWarnings("serial")
@Entity
@Table (name = "PICTURES")
@NamedQueries({
	@NamedQuery(name = "GetAllPictures", query = "SELECT p from Pictures p")
})
@XmlRootElement
public class Pictures implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private String fileUser;
	private Date datePublish;
	@ManyToOne
	private Category category;
	
	public Pictures () {
		
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
	
	@XmlTransient
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
        return "<picture>\n" +
                "        <id>" + this.id + "</id>\n" +
                "        <name>" + this.name + "</name>\n" +
                "        <description>" + this.description + "</description>\n" +
                "        <fileUser>" + this.fileUser + "</fileUser>\n" +
                "        <datePublish>" + this.datePublish + "</datePublish>\n" +
                "    </pictures>\n";
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
