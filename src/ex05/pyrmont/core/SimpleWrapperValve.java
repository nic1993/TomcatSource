package ex05.pyrmont.core;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Contained;
import org.apache.catalina.Container;
import org.apache.catalina.Valve;
import org.apache.catalina.comet.CometEvent;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public class SimpleWrapperValve implements Valve,Contained{

	@Override
	public void backgroundProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void event(Request arg0, Response arg1, CometEvent arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Valve getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void invoke(Request request, Response response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		SimpleWrapper wrapper = (SimpleWrapper) getContainer(); 
		ServletRequest sreq = request.getRequest(); 
		ServletResponse sres = response.getResponse(); 
		Servlet servlet = null; 
		HttpServletRequest hreq = null; 
			if (sreq instanceof HttpServletRequest) 
				hreq = (HttpServletRequest) sreq; 
			HttpServletResponse hres = null; 
				if (sres instanceof HttpServletResponse) hres = (HttpServletResponse) sres; 
				// Allocate a servlet instance to process this request 
				try { 
					servlet = wrapper.allocate(); 
					if (hres!=null && hreq!=null) 
					{ 
						servlet.service(hreq, hres); 
						} 
						else 
						{ 
						servlet.service(sreq, sres); 
						} 
						} 
						catch (ServletException e) {
						
						}
						}


	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setNext(Valve arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainer(Container arg0) {
		// TODO Auto-generated method stub
		
	}

}
