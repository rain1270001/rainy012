package com.zyy.boot23reday;

import com.alibaba.fastjson.JSONObject;
import com.zyy.boot23reday.pojo.Book;
import org.junit.Test;

import javax.xml.transform.Source;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 花间影
 * 10:28
 **/
public class MyTest {

    @Test//测试序列化
    public void testToJson(){
        //创建对象
        Book b =new Book();
        String id = UUID.randomUUID().toString().replaceAll("-", "").substring(10, 15);
        b.setId(id);
        b.setName("123456");
        b.setAutor("中昂");
        b.setPrice(12.56);
        //序列化为json对象的字符串
        String json = JSONObject.toJSONString(b);
        System.out.println("book="+json);
    }

    @Test//测试反序列化
    public void testToString(){
       String json="{\"autor\":\"爱的方式的\",\"id\":\"55sdb\",\"name\":\"1256\",\"price\":12.56}";
       //将json对象反序列化
        Book book = JSONObject.parseObject(json, Book.class);
        System.out.println("book="+book);

    }

    @Test
    public void testToJsonObject(){
        String json="{\"autor\":\"爱的方式的\",\"id\":\"55sdb\",\"name\":\"1256\",\"price\":12.56}";
        //json字符串序列化为jsonobject
        JSONObject jsonObject = JSONObject.parseObject(json);

        System.out.println("jsonObject="+jsonObject);
        //jsonobject是一个map类型可以通过get方法获取属性值
        String name = jsonObject.getString("name");

        System.out.println(name);

    }

    /**
     * {"age":20,"name":"李响","phone":"1350000000","school":{"address":"北京的海淀区","name":"北京大学"}}
     */
    @Test//获取地址值
    public void testGetAddress(){
        String json ="{\"age\":20,\"name\":\"李响\",\"phone\":\"1350000000\",\"school\":{\"address\":\"北京的海淀区\",\"name\":\"北京大学\"}}";
        JSONObject jsonObject = JSONObject.parseObject(json);
        JSONObject school = (JSONObject) jsonObject.get("school");
        String address = school.getString("address");
        System.out.println(address);
    }
    @Test//随机数
    public void testRandom(){
        ThreadLocalRandom r = ThreadLocalRandom.current();
        System.out.println(r.nextInt(10));
        System.out.println(r.nextDouble(10));
        System.out.println(r.nextBoolean());

    }
}
