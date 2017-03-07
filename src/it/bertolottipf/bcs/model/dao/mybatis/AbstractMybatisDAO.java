package it.bertolottipf.bcs.model.dao.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class AbstractMybatisDAO {

	protected SqlSessionFactory sessionFactory;
	
	public AbstractMybatisDAO(){
		try {
			Reader reader = Resources.getResourceAsReader("MyBatisConfig.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			sessionFactory = builder.build(reader);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
}