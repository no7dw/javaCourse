#deploy war file to tomcat
###build war file

    mvn package

###deploy to tomcat 
suppose CATALINA_BASE is /usr/local/tomcat8

    cp ./target/my-web-service.war /usr/local/tomcat8/webapps

#checkout log 

    26-Feb-2017 00:03:19.718 INFO [localhost-startStop-2] org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions Loading XML bean definitions from ServletContext resource [/WEB-INF/dispatcher-servlet.xml]
    26-Feb-2017 00:03:19.765 INFO [localhost-startStop-2] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping.registerHandlerMethod Mapped "{[/order/{name}],methods=[GET],params=[],headers=[],consumes=[],produces=[application/json],custom=[]}" onto public java.util.List<java.lang.Integer> com.javahonk.controller.SpringMVCRESTFulController.OrderGET(java.lang.String)
    26-Feb-2017 00:03:19.767 INFO [localhost-startStop-2] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping.registerHandlerMethod Mapped "{[/order],methods=[POST],params=[],headers=[],consumes=[],produces=[application/json],custom=[]}" onto public java.util.List<java.lang.Integer> com.javahonk.controller.SpringMVCRESTFulController.OrderPOST(java.lang.String)


we can see mapping api uri:

    /order/{name} GET
    /order POST

we can visit :

    http://localhost:8080
    http://localhost:8080/my-web-service/order/1


