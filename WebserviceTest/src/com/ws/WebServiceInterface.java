package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface WebServiceInterface{
 
	@WebMethod String getHelloWorldAsString(String name);
	@WebMethod int getSum(int num_1,int num2);
 
}