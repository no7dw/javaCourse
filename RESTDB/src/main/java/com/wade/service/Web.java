package com.wade.service;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@WebService(name = "Web")
public interface Web {

  @GET
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("/user")
  // @RequestMapping(value = "/user/{id}",  method=RequestMethod.GET, produces={"application/json"})
  public Response getUser(String inData);
  
  @POST
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("/user")
  // @RequestMapping(value = "/user/",  method=RequestMethod.POST, produces={"application/json"})
  public Response CreateUser(String inData);

  
}