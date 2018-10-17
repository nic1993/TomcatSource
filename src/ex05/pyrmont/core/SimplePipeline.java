package ex05.pyrmont.core;

import org.apache.catalina.Container;
import org.apache.catalina.Pipeline;
import org.apache.catalina.Valve;

public class SimplePipeline implements Pipeline{

	
	
	public SimplePipeline(SimpleWrapper simplewrapper) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addValve(Valve arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Valve getBasic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Valve getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Valve[] getValves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeValve(Valve arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBasic(Valve arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContainer(Container arg0) {
		// TODO Auto-generated method stub
		
	}

	 
}
