package com.webservice.test;
import java.io.IOException;
import java.net.*;
public class WebServiceTest {

	
	public static void main(String args[]){
		
		
		String soapXml =  "<test></test>" ;// jEdit: = buffer.getText(0,buffer.getLength())
			URL url;
			try {
				url = new URL("http://www.webservicex.net/sendsmsworld.asmx");
			
			java.net.URLConnection conn = url.openConnection();
			// Set the necessary header fields
			conn.setRequestProperty("SOAPAction", "http://www.webservicex.net/sendsmsworld.asmx?WSDL");
			conn.setDoOutput(true);
			// Send the request
			java.io.OutputStreamWriter wr = new java.io.OutputStreamWriter(conn.getOutputStream());
			wr.write(soapXml);
			wr.flush();
			// Read the response
			java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) { System.out.println(line); /*jEdit: print(line); */ }
			
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
}
