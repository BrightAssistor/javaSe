package com.bristor.utils;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.bristor.utils.FileUtils;

public class HttpClient {
	public static String sendPostData(String url,String fileName) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response = null;
		String result = null;
		try {
			String readFile = FileUtils.readFile(fileName);
			httpPost.setHeader("Content-Type","application/json,charset=utf8");
			StringEntity stringEntity = new StringEntity(readFile,"UTF-8");
			httpPost.setEntity(stringEntity);
			response=httpClient.execute(httpPost);
			result = EntityUtils.toString(response.getEntity());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public static String sendGetData(String url,String content) {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Content-Type","application/json,charset=utf8");
		String result = null;
		try {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	public static void main(String[] args) {
//		String result = HttpClient.sendPostData("http://127.0.0.1:8080/HttpServer/sendPostData","sendData.xml");
		String result = HttpClient.sendPostData("http://127.0.0.1:8080/HttpServer/sendPostData","test2.txt");
//		String result = HttpClient.sendGetData("http://127.0.0.1:8080/HttpServer/sendGetData", "");
//		String result = HttpClient.sendGetData("http://127.0.0.1:8080/HttpServer/sendGetData", "test2.txt");
//		String result = HttpClient.sendGetData("https://www.baidu.com/", "");
		System.out.println("���ؽ����"+result);
	}
}
