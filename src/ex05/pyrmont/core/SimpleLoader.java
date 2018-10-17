package ex05.pyrmont.core;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;

import org.apache.catalina.Container;

public class SimpleLoader {

	public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot";
	ClassLoader classLoader = null;
	Container container = null;
	
	public SimpleLoader() {
		// TODO Auto-generated constructor stub
		try {
			URL[] urls = new URL[1];
			URLStreamHandler streamHandler = null;
			File classPath = new File(WEB_ROOT);
			String repository = (new URL("file",null,classPath.getCanonicalPath() + File.separator)).toString();
			
			urls[0] = new URL(null,repository,streamHandler);
			classLoader = new URLClassLoader(urls);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
