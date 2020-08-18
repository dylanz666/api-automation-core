package com.github.dylanz666.domain;

import com.alibaba.fastjson.JSONObject;
import com.github.dylanz666.constant.RequestMethodEnum;
import io.restassured.RestAssured;
import io.restassured.config.ConnectionConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.Filter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class RequestSpec implements Serializable {
    private static final long serialVersionUID = 1L;

    private RestAssuredConfig config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation()).connectionConfig(new ConnectionConfig().closeIdleConnectionsAfterEachResponseAfter(10, TimeUnit.MINUTES));

    private String url;
    private RequestMethodEnum method;
    private Map<String, String> headers;
    private String requestBody;
    private Map<String, String> formParams;
    private JSONObject formData;
    private Auth auth;
    private Proxy proxy;
    private Filter filter;
    private List<Filter> filters;
}
