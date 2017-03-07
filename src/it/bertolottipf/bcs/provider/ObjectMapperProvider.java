package it.bertolottipf.bcs.provider;

import java.text.SimpleDateFormat;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;

@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper>{

	private ObjectMapper mapper;
	
	public ObjectMapperProvider() {
		System.out.println("initializza provider");
		mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
	}
	
	@Override
	public ObjectMapper getContext(Class<?> arg0) {
		System.out.println("get provider");
		return mapper;
	}

}
