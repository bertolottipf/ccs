package it.bertolottipf.bcs.model.pojo;

import it.bertolottipf.bcs.model.dao.DressDAO;
import it.bertolottipf.bcs.model.dao.MessageDAO;

public class User {
	private int id;
	private String username;
	private String password;
	private boolean active;
	private String action;
	private int role;
	private String citta;
	private String provincia;
	
	private MessageDAO messageDAO;
	private DressDAO dressDAO;
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public boolean isActive() {
		return active;
	}
	public String getAction() {
		return action;
	}
	public DressDAO getDressDAO() {
		return dressDAO;
	}
	public MessageDAO getMessageDAO() {
		return messageDAO;
	}
	public int getRole() {
		return role;
	}
	public String getCitta() {
		return citta;
	}
	public String getProvincia() {
		return provincia;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setDressDAO(DressDAO dressDAO) {
		this.dressDAO = dressDAO;
	}
	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
