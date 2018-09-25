package ex02.pymont;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Response {

	private static final int BUFFER_SIZE = 1024;
	Request request;
	OutputStream output;
	
	public Response(OutputStream output) {
		// TODO Auto-generated constructor stub
		this.output = output;
	}
	
	public void setRequest(Request request) {
		this.request = request;
	}
	
	public void sendStaticResource() throws IOException {
		byte[] bytes = new byte[BUFFER_SIZE];
		FileInputStream fis = null;
		
		
		try {
			File file = new File(HttpServer1.WEB_ROOT,request.getUri());
			
			System.out.println(file.exists());
			if(file.exists()) {
				fis = new FileInputStream(file);
				int ch = fis.read(bytes,0,BUFFER_SIZE);
				while (ch != -1) {
					output.write(bytes, 0, ch);
					ch = fis.read(bytes,0,BUFFER_SIZE);
				}
			}else {
				String errorMessage = "Not Found";
				output.write(errorMessage.getBytes());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fis != null) fis.close();
		}
	}
}
