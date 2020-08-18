package com.github.dylanz666.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.dylanz666.constant.RequestMethodEnum;
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
    public void testGetRequest() {
        int count = 2;
        String url = "https://api.apiopen.top/getJoke?page=1&count=%d&type=video";
        url = String.format(url, count);

        RequestSpec requestSpec = new RequestSpec();
        requestSpec.setUrl(url);
        requestSpec.setMethod(RequestMethodEnum.GET);

        Response response = requestController.launch(requestSpec);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(200, JSONObject.parseObject(response.asString()).getIntValue("code"));
        Assert.assertEquals(count, JSONObject.parseObject(response.asString()).getJSONArray("result").size());
    }
}
