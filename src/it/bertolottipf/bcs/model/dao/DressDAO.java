package it.bertolottipf.bcs.model.dao;

import java.util.List;

import it.bertolottipf.bcs.model.pojo.Dress;

public interface DressDAO {
	List<Dress> searchAll();
	boolean create(Dress dress);
	Dress read(int id);
	boolean update(Dress dress);
	boolean delete(int id);

	List<Dress> searchByUserId(int userId);
}
