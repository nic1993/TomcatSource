package ex02.pymont;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletProcessor1 {

	public void process(Request request,Response response) {
		String uri = request.getUri();
		
		String servletName = uri.substring(uri.lastIndexOf("/") + 1);
		
		System.out.println("servletName:" + servletName);
		URLClassLoader loader = null;
		try {
			URL[] urls = new URL[1];
			URLStreamHandler streamHandler = null;
			File classPath = new File(Constants.WEB_ROOT + "src" + File.separator + "ex02" + File.separator + "pymont" + File.separator);

			String repository = (new URL("file", null,classPath.getCanonicalPath() + File.separator)).toString();
			
			System.out.println("repository:" + repository);
			
			urls[0] = new URL(null, repository, streamHandler);
			
			loader = new URLClassLoader(urls);
			
			Class myClass = null;
			
			try {
				myClass = loader.loadClass("ex02.pymont." + servletName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Servlet servlet = null;

			try {
				servlet = (Servlet) myClass.newInstance();
				
				System.out.println(servlet.getClass().getSimpleName());
				
				servlet.service((ServletRequest)request, (ServletResponse)response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
