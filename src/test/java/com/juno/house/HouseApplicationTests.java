package com.juno.house;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HouseApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private HttpClient httpClient;

	@Test
	public void testHttpClient() throws ClientProtocolException, IOException {
		System.out.println(EntityUtils.toString(httpClient.execute(new HttpGet("https://www.baidu.com")).getEntity()));
	}
}
