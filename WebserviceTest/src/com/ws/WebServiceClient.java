package com.ws;

import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

 
public class WebServiceClient{
 
	public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:9998/ws/hello?wsdl");
 
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.com/", "WebServiceImplService");
 
        Service service = Service.create(url, qname);
 
        WebServiceInterface hello = service.getPort(WebServiceInterface.class);
 
        System.out.println( hello.getHelloWorldAsString("Prateik"));
     
        //for(int i=0;i<1000;i++)
        //System.out.println(hello.getSum(10,i));
 
    }
}