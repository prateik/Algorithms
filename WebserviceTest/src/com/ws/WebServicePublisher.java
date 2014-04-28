package com.ws;
import javax.xml.ws.Endpoint;



 
//Endpoint publisher
public class WebServicePublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9998/ws/hello", new WebServiceImpl());
	   
	   Endpoint.publish("http://localhost:9998/ws/test", new WebServiceImpl());
 
    }
 
}