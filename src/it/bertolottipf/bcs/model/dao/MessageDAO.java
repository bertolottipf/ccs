package it.bertolottipf.bcs.model.dao;

import java.util.List;

import it.bertolottipf.bcs.model.pojo.Message;

public interface MessageDAO {
	List<Message> searchAll();
	boolean create(Message dress);
	Message read(int id);
	boolean update(Message dress);
	boolean delete(int id);
	
	List<Message> selectByUsername(String username);
}
