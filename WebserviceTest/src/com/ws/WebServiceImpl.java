package com.ws;

 
import javax.jws.*;
//Service Implementation

@WebService(endpointInterface = "com.ws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello " + name;
	}

	@Override
	public int getSum(int num_1, int num2) {
		
		return num_1+num2;
		
	}

}