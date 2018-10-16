package connector.http;
import org.apache.catalina.util.RequestUtil;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import ex02.pymont.Request;
import ex02.pymont.Response;

public class HttpProcessor {
	
	private HttpRequest request;
	private HttpResponse response;
	
	private HttpConnector connector = null;
	private HttpRequestLine requestLine = new HttpRequestLine();
	
	public void process(Socket socket) {
		InputStream input = null;
		OutputStream output = null;
		
		try {
			input = new SocketInputStream(socket.getInputStream(), 2048);
			output = socket.getOutputStream();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
