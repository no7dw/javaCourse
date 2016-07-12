package com.wade.service;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.util.ajax.JSON;

import net.sf.json.JSONObject;

public class WebImpl implements Web {

  @Override
  public Response PostHelloWorldData(String inData) {
    if(inData==null) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    Map<String, String> data = new HashMap<String, String>();
   
    JSONObject outData = new JSONObject();
    outData.put("data", "Hello World");
    return Response.ok(outData).build();
  }

  @Override
  public Response getReturnData(String inData) {
    System.out.println("parameter: " + inData);
    JSONObject outData = new JSONObject();
    outData.put("decodeData", "Hello World2");
    return Response.ok(outData).build();
  }
  
}