package com.hongfei.xu.demo;

import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

public class Main {

	public static void main(String[] args) throws Exception{
		//请求的地址  
		String url = "http://localhost:8080/demo/home/test.do";  
		//①创建Http Request(内部使用HttpURLConnection)  
		ClientHttpRequest request =   
		    new SimpleClientHttpRequestFactory().     
		        createRequest(new URI(url), HttpMethod.POST);  
		//②设置请求头的内容类型头和内容编码（GBK）  
		request.getHeaders().set("Content-Type", "application/json;charset=gbk");  
		//③以GBK编码写出请求内容体  
		String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";  
		request.getBody().write(jsonData.getBytes("gbk"));  
		//④发送请求并得到响应  
		ClientHttpResponse response = request.execute();  
		System.out.println(response.getStatusCode()); 
	}

}
