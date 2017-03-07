package it.bertolottipf.bcs.model.pojo;

public class Dress {
	private int id;
	private String size;
	private String age;
	private String files;
	private String colour;
	private String matherial;
	private String  description;
	private User user;
	
	
	public int getId() {
		return id;
	}
	public String getSize() {
		return size;
	}
	public String getAge() {
		return age;
	}
	public String getFiles() {
		return files;
	}
	public String getColour() {
		return colour;
	}
	public String getMatherial() {
		return matherial;
	}
	
	public String getDescription() {
		return description;
	}
	public User getUser() {
		return user;
	}
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setMatherial(String matherial) {
		this.matherial = matherial;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
