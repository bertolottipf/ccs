package it.bertolottipf.bcs.model.dao;

import java.util.List;

import it.bertolottipf.bcs.model.pojo.User;

public interface UserDAO {
	List<User> searchAll();
	boolean create(User user);
	User read(int id);
	boolean update(User user);
	boolean delete(int id);
}
