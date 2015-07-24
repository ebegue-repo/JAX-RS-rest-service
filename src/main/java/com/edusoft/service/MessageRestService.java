package com.edusoft.service;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import com.edusoft.dto.Contact_dto;

@Path("/contact")
public class MessageRestService {

	@GET
	@Path("/{id}")
	public Response printMessage(@PathParam("id") String id) {
		try {
			Contact_dto dto = new Contact_dto("Paco", "Perez", 99);
			ObjectWriter writer = new ObjectMapper().writer()
					.withDefaultPrettyPrinter();
			String json = writer.writeValueAsString(dto);
			String result = "Contact with id " + id + ": " + json;

			return Response.status(200).entity(result).build();
		} catch (JsonGenerationException e) {
			e.printStackTrace();
			return null;
		} catch (JsonMappingException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}