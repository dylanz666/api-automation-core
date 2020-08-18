package com.github.dylanz666.service;

import com.github.dylanz666.domain.IProxyService;
import com.github.dylanz666.domain.Proxy;
import io.restassured.RestAssured;
import org.springframework.stereotype.Service;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class ProxyServiceImpl implements IProxyService<Proxy> {
    public void setProxy(Proxy proxy) {
        if (proxy == null) {
            return;
        }
        String proxyHost = proxy.getHost();
        int proxyPort = proxy.getPort();
        if (!proxyHost.equals("") && proxyPort > 0) {
            RestAssured.proxy(proxyHost, proxyPort);
        }
    }
}
