package ex05.pyrmont.core;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.catalina.Contained;
import org.apache.catalina.Container;
import org.apache.catalina.Valve;
import org.apache.catalina.comet.CometEvent;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

public class ClientIPLoggerValve implements Valve,Contained{

	protected Container container;
	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return container;
	}

	@Override
	public void setContainer(Container container) {
		// TODO Auto-generated method stub
		this.container = container;
	}

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
	public void invoke(Request arg0, Response arg1) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
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

}
