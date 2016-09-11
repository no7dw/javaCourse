package com.wade.service;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.util.ajax.JSON;

import net.sf.json.JSONObject;

public class WebImpl implements Web {

  @Override
  public Response CreateUser(String inData) {
    if(inData==null) {
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    // Map<String, String> data = new HashMap<String, String>();
   
    JSONObject outData = new JSONObject();
    JSONObject detail = new JSONObject();
    detail.put("created", "20160910");
    outData.put("code", "0");
    outData.put("data", "1");
    outData.put("detail", detail);
    return Response.ok(outData).build();
  }

  @Override
  public Response getUser(String inData) {
    // System.out.println("parameter: " + inData); //todo
    JSONObject outData = new JSONObject();
    outData.put("code", 0);
    outData.put("data", "2");
    return Response.ok(outData).build();
  }
  
}