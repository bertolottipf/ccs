package it.bertolottipf.bcs.model.pojo;

import java.util.Date;

/**
 * @author paolo
 *
 */
public class Message {
	
	private int id;
	private String fromUsername;
	private String toUsername;
	private Date date;
	private String msg;
	
	
	
	public int getId() {
		return id;
	}
	public String getFromUsername() {
		return fromUsername;
	}
	public String getToUsername() {
		return toUsername;
	}
	public Date getDate() {
		return date;
	}
	public String getMsg() {
		return msg;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setFromUsername(String fromUsername) {
		this.fromUsername = fromUsername;
	}
	public void setToUsername(String toUsername) {
		this.toUsername = toUsername;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
