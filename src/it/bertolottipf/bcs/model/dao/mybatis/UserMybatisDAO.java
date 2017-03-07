package it.bertolottipf.bcs.model.dao.mybatis;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.bertolottipf.bcs.model.dao.UserDAO;
import it.bertolottipf.bcs.model.pojo.User;


public class UserMybatisDAO extends AbstractMybatisDAO implements UserDAO{
	
	@Override
	public List<User> searchAll() {
		SqlSession session = sessionFactory.openSession();
		List<User> result = session.selectList("UserMapper.selectAll");
		return null;
	}
	
	
	@Override
	public boolean create(User user) {
		SqlSession session = sessionFactory.openSession();
		int result = session.insert("UserMapper.inser", user);
		
		return result != 0 ? true : false;
	}
	
	
	@Override
	public User read(int id) {
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("UserMapper.selectOne", id);
		
		return user;
	}
	
	
	@Override
	public boolean update(User user) {
		SqlSession session = sessionFactory.openSession();
		int result = session.update("UserMapper.update", user);
		
		return result == 1 ? true : false;
	}
	
	
	@Override
	public boolean delete(int id) {
		SqlSession session = sessionFactory.openSession();
		int result = session.delete("UserMapper.delete", id);
		
		return result == 1 ? true : false;
	}

}
