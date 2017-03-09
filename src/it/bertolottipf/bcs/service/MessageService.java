package it.bertolottipf.bcs.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.bertolottipf.bcs.model.dao.MessageDAO;
import it.bertolottipf.bcs.model.dao.mybatis.MessageMybatisDAO;
import it.bertolottipf.bcs.model.pojo.Message;

@Path("/msg")
public class MessageService {

	private MessageDAO messageDAO;

	public MessageService() {
		messageDAO = new MessageMybatisDAO();
	}

	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> searchAll() {
		return messageDAO.searchAll();
	}

	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message create(Message message) {
		messageDAO.create(message);
		return messageDAO.read(message.getId());
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message read(@PathParam("id") int id) {
		return messageDAO.read(id);
	}

	@Path("/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") int id) {
		return messageDAO.delete(id) + "";
	}

	@Path("/{id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message update(@PathParam("id") int id, Message message) {
		message.setId(id);
		messageDAO.update(message);
		return messageDAO.read(id);
	}

}
