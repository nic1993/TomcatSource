package connector.http;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.catalina.util.ParameterMap;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpParams;

import com.sun.net.httpserver.Headers;

public class Httprequest implements HttpRequest{

	protected HashMap Headers = new HashMap<>();
	protected ArrayList cookies = new ArrayList<>();
	protected ParameterMap map = null;
	
	@Override
	public ProtocolVersion getProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsHeader(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Header[] getHeaders(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header getFirstHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header getLastHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Header[] getAllHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHeader(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeader(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHeaders(Header[] headers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeHeaders(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HeaderIterator headerIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HeaderIterator headerIterator(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpParams getParams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParams(HttpParams params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RequestLine getRequestLine() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
