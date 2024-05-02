package Tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



public class TestRest {


   // @Test
    public void test_1()
    {
        Response response= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("Response code is " +response.getStatusCode());
        System.out.println("Response time " +response.getTime());
        int statusCode  = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }

    @Test
    public void testPost()
    {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("name","Ragav");
        map.put("job","Teacher");
        System.out.println(map);

    }
}
