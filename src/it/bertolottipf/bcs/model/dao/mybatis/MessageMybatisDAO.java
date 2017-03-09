package it.bertolottipf.bcs.model.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.bertolottipf.bcs.model.dao.MessageDAO;
import it.bertolottipf.bcs.model.pojo.Message;

public class MessageMybatisDAO extends AbstractMybatisDAO implements MessageDAO {
	
	
	@Override
	public List<Message> searchAll() {
		SqlSession session = sessionFactory.openSession();
		List<Message> messages = session.selectList("MessageMapper.selectAll");
		
		return messages;
	}
	

	@Override
	public boolean create(Message dress) {
		SqlSession session = sessionFactory.openSession();
		int result = session.insert("MessageMapper.insert", dress);
		return result == 1 ? true : false;
	}

	@Override
	public Message read(int id) {
		SqlSession session = sessionFactory.openSession();
		Message message = session.selectOne("MessageMapper.selectOne", id);
		
		return message;
	}

	@Override
	public boolean update(Message dress) {
		SqlSession session = sessionFactory.openSession();
		int result = session.update("MessageMapper.update", dress);
		
		return result == 1 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		SqlSession session = sessionFactory.openSession();
		int result = session.update("MessageMapper.delete", id);
		
		return result == 1 ? true : false;
	}
	
	
	@Override
	public List<Message> selectByUsername(String username) {
		SqlSession session = sessionFactory.openSession();
		List<Message> messages = session.selectList("MessageMapper.selectByUsername", username);
		
		return messages;
	}

}
