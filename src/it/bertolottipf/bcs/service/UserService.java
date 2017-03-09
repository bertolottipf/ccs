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

import it.bertolottipf.bcs.model.dao.UserDAO;
import it.bertolottipf.bcs.model.dao.mybatis.UserMybatisDAO;
import it.bertolottipf.bcs.model.pojo.User;

@Path("/user")
public class UserService {

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserMybatisDAO();
	}

	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> searchAll() {
		return userDAO.searchAll();
	}

	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User create(User user) {
		userDAO.create(user);
		return userDAO.read(user.getId());
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User read(@PathParam("id") int id) {
		return userDAO.read(id);
	}

	@Path("/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") int id) {
		return userDAO.delete(id) + "";
	}

	@Path("/{id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User update(@PathParam("id") int id, User user) {
		user.setId(id);
		userDAO.update(user);
		return userDAO.read(id);
	}

}
