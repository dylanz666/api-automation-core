package com.github.dylanz666.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.dylanz666.constant.MethodEnum;
import com.github.dylanz666.domain.RequestSpec;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RequestControllerTest {
    @Autowired
    private RequestController requestController;

    @Test
    public void testLaunchGetRequest() {
        String name = "test1";
        String url = "https://postman-echo.com/get?name=%s";
        url = String.format(url, name);

        RequestSpec requestSpec = new RequestSpec();
        requestSpec.setUrl(url);
        requestSpec.setMethod(MethodEnum.GET);

        Response response = requestController.launch(requestSpec);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(url, JSONObject.parseObject(response.asString()).getString("url"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("args").getString("name"));
    }

    @Test
    public void testLaunchPostRequest() {
        String name = "test2";
        String url = "https://postman-echo.com/post";
        JSONObject body = new JSONObject();
        body.put("method", MethodEnum.POST.toString());
        body.put("name", name);

        RequestSpec requestSpec = new RequestSpec();
        requestSpec.setUrl(url);
        requestSpec.setMethod(MethodEnum.POST);
        requestSpec.setRequestBody(body.toString());

        Response response = requestController.launch(requestSpec);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(url, JSONObject.parseObject(response.asString()).getString("url"));
        Assert.assertEquals(MethodEnum.POST.toString(), JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"));
        Assert.assertEquals(MethodEnum.POST.toString(), JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"));
    }

    @Test
    public void testLaunchPutRequest() {
        String name = "test3";
        String url = "https://postman-echo.com/put";
        JSONObject body = new JSONObject();
        body.put("method", MethodEnum.PUT.toString());
        body.put("name", name);

        RequestSpec requestSpec = new RequestSpec();
        requestSpec.setUrl(url);
        requestSpec.setMethod(MethodEnum.PUT);
        requestSpec.setRequestBody(body.toString());

        Response response = requestController.launch(requestSpec);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(url, JSONObject.parseObject(response.asString()).getString("url"));
        Assert.assertEquals(MethodEnum.PUT.toString(), JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"));
        Assert.assertEquals(MethodEnum.PUT.toString(), JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"));
    }

    @Test
    public void testLaunchDeleteRequest() {
        String name = "test4";
        String url = "https://postman-echo.com/delete";
        JSONObject body = new JSONObject();
        body.put("method", MethodEnum.DELETE.toString());
        body.put("name", name);

        RequestSpec requestSpec = new RequestSpec();
        requestSpec.setUrl(url);
        requestSpec.setMethod(MethodEnum.DELETE);
        requestSpec.setRequestBody(body.toString());

        Response response = requestController.launch(requestSpec);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(url, JSONObject.parseObject(response.asString()).getString("url"));
        Assert.assertEquals(MethodEnum.DELETE.toString(), JSONObject.parseObject(response.asString()).getJSONObject("data").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("data").getString("name"));
        Assert.assertEquals(MethodEnum.DELETE.toString(), JSONObject.parseObject(response.asString()).getJSONObject("json").getString("method"));
        Assert.assertEquals(name, JSONObject.parseObject(response.asString()).getJSONObject("json").getString("name"));
    }

    @Test
    public void testLaunchPatchRequest() {
        //TBD
    }
}
