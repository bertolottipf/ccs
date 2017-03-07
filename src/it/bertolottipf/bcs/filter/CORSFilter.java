package it.bertolottipf.bcs.filter;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

public class CORSFilter implements ContainerResponseFilter{

	@Override
	public ContainerResponse filter(ContainerRequest req, ContainerResponse resp) {
		resp.getHttpHeaders().putSingle("Access-Control-Allow-Origin", "*");
		resp.getHttpHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.getHttpHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept");
		return resp;
	}

}
