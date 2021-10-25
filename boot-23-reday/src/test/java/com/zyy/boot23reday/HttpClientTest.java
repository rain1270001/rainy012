package com.zyy.boot23reday;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 花间影
 * 11:14
 **/
public class HttpClientTest {

    @Test//get
    public void testGet(){
        //创建对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建get请求
        String url ="http://t.weather.itboy.net/api/weather/city/101030100";
        HttpGet get =new HttpGet(url);
        //执行请求

        try {
            CloseableHttpResponse response = httpClient.execute(get);

            //获取应答信息

            //响应码
            int code = response.getStatusLine().getStatusCode();
            System.out.println("响应码:"+code);

            //响应类型
            Header contentType = response.getEntity().getContentType();
            System.out.println("响应数据类型:"+contentType);

            //相应数据
            InputStream content = response.getEntity().getContent();
            //进行io流转换
            BufferedReader br =new BufferedReader(new InputStreamReader(content));
            String line =null;
            StringBuffer buffer =new StringBuffer("");
            while ((line=br.readLine())!=null){
                buffer.append(line);
            }

            //读取到的数据
            System.out.println("获取数据的内容:"+buffer);

            //关闭
            httpClient.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
