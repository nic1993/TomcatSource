package ex05.pyrmont.core;

import java.beans.PropertyChangeListener;
import java.io.IOException;

import javax.management.ObjectName;
import javax.naming.directory.DirContext;
import javax.servlet.MultipartConfigElement;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;

import org.apache.catalina.AccessLog;
import org.apache.catalina.Cluster;
import org.apache.catalina.Container;
import org.apache.catalina.ContainerListener;
import org.apache.catalina.InstanceListener;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.LifecycleState;
import org.apache.catalina.Loader;
import org.apache.catalina.Manager;
import org.apache.catalina.Pipeline;
import org.apache.catalina.Realm;
import org.apache.catalina.Wrapper;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.juli.logging.Log;

import javafx.scene.Parent;

public class SimpleWrapper implements Wrapper{

	
	Loader loader;
	protected Container parent = null;
	
	private SimplePipeline pipeline = new SimplePipeline(this);
	
	
	public SimpleWrapper() {
		// TODO Auto-generated constructor stub
		pipeline.setBasic(new SimpleWrapperValve());
	}
	@Override
	public void addChild(Container arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addContainerListener(ContainerListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backgroundProcess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Container findChild(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Container[] findChildren() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContainerListener[] findContainerListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fireContainerEvent(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccessLog getAccessLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBackgroundProcessorDelay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cluster getCluster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loader getLoader() {
		// TODO Auto-generated method stub
		if(loader != null) return loader;
		if(parent != null) return parent.getLoader();
		return null;
	}



	@Override
	public Manager getManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getMappingObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectName getObjectName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Container getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassLoader getParentClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pipeline getPipeline() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Realm getRealm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DirContext getResources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStartStopThreads() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void invoke(Request arg0, Response arg1) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logAccess(Request arg0, Response arg1, long arg2, boolean arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChild(Container arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContainerListener(ContainerListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackgroundProcessorDelay(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCluster(Cluster arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoader(Loader arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setManager(Manager arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setParent(Container arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setParentClassLoader(ClassLoader arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRealm(Realm arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResources(DirContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStartStopThreads(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLifecycleListener(LifecycleListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws LifecycleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LifecycleListener[] findLifecycleListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LifecycleState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init() throws LifecycleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLifecycleListener(LifecycleListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() throws LifecycleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() throws LifecycleException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInitParameter(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInstanceListener(InstanceListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMapping(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSecurityReference(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Servlet allocate() throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deallocate(Servlet arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String findInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] findInitParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] findMappings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findSecurityReference(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] findSecurityReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getAvailable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLoadOnStartup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MultipartConfigElement getMultipartConfigElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRunAs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servlet getServlet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getServletMethods() throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementErrorCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOverridable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUnavailable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void load() throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInitParameter(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeInstanceListener(InstanceListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMapping(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSecurityReference(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void servletSecurityAnnotationScan() throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAsyncSupported(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAvailable(long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoadOnStartup(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMultipartConfigElement(MultipartConfigElement arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOverridable(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRunAs(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServlet(Servlet arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletClass(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletSecurityAnnotationScanRequired(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unavailable(UnavailableException arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unload() throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Log getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

}
