package com.wade.service;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@WebService(name = "Web")
public interface Web {

  @POST
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("/")
  public Response PostHelloWorldData(String inData);
  
  @POST
  @Produces({ MediaType.APPLICATION_JSON })
  @Path("/returnData")
  public Response getReturnData(String inData);

  
}