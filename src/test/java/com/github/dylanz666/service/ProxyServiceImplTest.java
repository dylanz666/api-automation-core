package com.github.dylanz666.service;

import com.github.dylanz666.domain.Proxy;
import io.restassured.RestAssured;
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
public class ProxyServiceImplTest {
    @Autowired
    private ProxyServiceImpl proxyService;
    @Autowired
    private Proxy proxy;

    @Test
    public void testSetProxy() {
        String host = "127.0.0.2";
        int port = 8888;
        proxy.setHost(host);
        proxy.setPort(port);

        proxyService.setProxy(proxy);

        Assert.assertEquals(host, RestAssured.proxy.getHost());
        Assert.assertEquals(port, RestAssured.proxy.getPort());
    }
}
