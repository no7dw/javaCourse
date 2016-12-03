package com.javahonk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.core.Response;


import net.sf.json.JSONObject;

@Controller
public class SpringMVCRESTFulController {
    
    @RequestMapping(value = "/order/{name}",  method=RequestMethod.GET, produces={"application/json"})
    public @ResponseBody List<Integer> OrderGET(@PathVariable String name) {        
        return returnDataList();
    }

    @RequestMapping(value = "/order", method=RequestMethod.POST, produces={"application/json"})
    public @ResponseBody List<Integer> OrderPOST(@RequestParam String name) {       
        return returnDataList();
    }
    
    @RequestMapping(value = "/order/{name}", method=RequestMethod.PUT, produces={"application/json"})
    public @ResponseBody List<Integer> OrderPUT(@PathVariable String name) {        
        return returnDataList();
    }
    
    @RequestMapping(value = "/order/{name}", method=RequestMethod.DELETE, produces={"application/json"})
    public @ResponseBody List<Integer> OrderDelete(@PathVariable String name) {     
        return returnDataList();
    
    }
    private void re(){
    	JSONObject outData = new JSONObject();
        outData.put("code", "0");
        outData.put("data", "1");
        return Response.ok(outData).build();
    }
    
    private List<Integer> returnDataList() {
        Random rand = new Random();
        Integer randomNum = rand.nextInt();     
        List<Integer> list = new ArrayList<Integer>();
        list.add(randomNum);        
        return list;//Q: how to make json
    }

}
