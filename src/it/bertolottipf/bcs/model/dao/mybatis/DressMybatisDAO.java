package it.bertolottipf.bcs.model.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.bertolottipf.bcs.model.dao.DressDAO;
import it.bertolottipf.bcs.model.pojo.Dress;

public class DressMybatisDAO extends AbstractMybatisDAO implements DressDAO {
	
	@Override
	public List<Dress> searchAll() {
		SqlSession session = sessionFactory.openSession();
		List<Dress> dresses = session.selectList("DressMapper.searchAll");
		
		return dresses;
	}

	@Override
	public boolean create(Dress dress) {
		SqlSession session = sessionFactory.openSession();
		int result = session.insert("DressMapper.insert", dress);
		
		return result == 1 ? true : false;
	}

	@Override
	public Dress read(int id) {
		SqlSession session = sessionFactory.openSession();
		Dress dress = session.selectOne("DressMapper.selectOne", id);
		
		return dress;
	}

	@Override
	public boolean update(Dress dress) {
		SqlSession session = sessionFactory.openSession();
		int result = session.update("DressMapper.update", dress);
		
		return result == 1 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		SqlSession session = sessionFactory.openSession();
		int result = session.delete("DressMapper.update", id);
		
		return result == 1 ? true : false;
	}

	
	
	
	
	
	
	@Override
	public List<Dress> searchByUserId(int userId) {
		SqlSession session = sessionFactory.openSession();
		List<Dress> dresses = session.selectList("DressMapper.selectByUserId", userId);
		
		return dresses;
	}

}
