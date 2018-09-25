package ex02.pymont;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;



public class HttpServer1 {

	public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot";
	
	private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";
	
	private boolean shutdown = false;
	
	public static void main(String[] args) {
		HttpServer1 server = new HttpServer1();
		server.await();
	}
	
	public void await() {
		ServerSocket serverSocket = null;
		int port = 8080;
		
		try {
			serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
		while (!shutdown) {
			Socket socket = null;
			InputStream input = null;
			OutputStream output = null;
	
			try {
				socket = serverSocket.accept();
				input = socket.getInputStream();
				output = socket.getOutputStream();
				
				System.out.println("request: start!" );
				Request request = new Request(input);
				request.parse();
				
				System.out.println("response: start!" );
				Response response = new Response(output);
				response.setRequest(request);
				
				
				if(request.getUri().startsWith("/servlet")) {
					
				}
				
				response.sendStaticResource();
				
				socket.close();
				
				shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				continue;
			}
		}
		
				
	}
}
