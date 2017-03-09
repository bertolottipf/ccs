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

import it.bertolottipf.bcs.model.dao.DressDAO;
import it.bertolottipf.bcs.model.dao.mybatis.DressMybatisDAO;
import it.bertolottipf.bcs.model.pojo.Dress;

@Path("/dress")
public class DressService {

	private DressDAO dressDAO;

	public DressService() {
		dressDAO = new DressMybatisDAO();
	}

	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dress> searchAll() {
		return dressDAO.searchAll();
	}

	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Dress create(Dress dress) {
		dressDAO.create(dress);
		return dressDAO.read(dress.getId());
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Dress read(@PathParam("id") int id) {
		return dressDAO.read(id);
	}

	@Path("/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String delete(@PathParam("id") int id) {
		return dressDAO.delete(id) + "";
	}

	@Path("/{id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Dress update(@PathParam("id") int id, Dress dress) {
		dress.setId(id);
		dressDAO.update(dress);
		return dressDAO.read(id);
	}

}
