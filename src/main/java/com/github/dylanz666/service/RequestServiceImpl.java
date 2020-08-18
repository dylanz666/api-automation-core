package com.github.dylanz666.service;

import com.github.dylanz666.constant.RequestMethodEnum;
import com.github.dylanz666.domain.*;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class RequestServiceImpl implements IRequestService<RequestSpec> {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String logTemplate = "[ %s ] %s";

    @Autowired
    private AllureStepsServiceImpl allureStepsService;
    @Autowired
    private AllureSteps allureSteps;
    @Autowired
    private ProxyServiceImpl proxyService;

    public Response get(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        String url = requestSpec.getUrl();
        RequestMethodEnum method = requestSpec.getMethod();
        //headers
        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        //request body
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        //form params
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        //auth
        Auth auth = requestSpec.getAuth();
        //proxy
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        RequestSpecification spec = given()
                .config(config)
                .headers(headers)
                .formParams(formParams);
        if (auth != null) {
            spec.auth().preemptive().basic(auth.getUserName(), auth.getPassword());
        }

        Response response = spec
                .when()
                .body(requestBody)
                .get(url)
                .then()
                .extract()
                .response();

        logger.info(String.format(logTemplate, method.toString(), url));

        allureSteps.setMethod(method);
        allureSteps.setUrl(requestSpec.getUrl());
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
        return response;
    }

    public Response post(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        String url = requestSpec.getUrl();
        RequestMethodEnum method = requestSpec.getMethod();
        //headers
        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        //request body
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        //form params
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        //auth
        Auth auth = requestSpec.getAuth();
        //proxy
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        RequestSpecification spec = given()
                .config(config)
                .headers(headers)
                .formParams(formParams);
        if (auth != null) {
            spec.auth().preemptive().basic(auth.getUserName(), auth.getPassword());
        }

        Response response = spec
                .when()
                .body(requestBody)
                .post(url)
                .then()
                .extract()
                .response();

        logger.info(String.format(logTemplate, method.toString(), url));

        allureSteps.setMethod(requestSpec.getMethod());
        allureSteps.setUrl(requestSpec.getUrl());
        allureSteps.setRequestBody(requestSpec.getRequestBody());
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
        return response;
    }

    public Response put(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        String url = requestSpec.getUrl();
        RequestMethodEnum method = requestSpec.getMethod();
        //headers
        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        //request body
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        //form params
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        //auth
        Auth auth = requestSpec.getAuth();
        //proxy
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        RequestSpecification spec = given()
                .config(config)
                .headers(headers)
                .formParams(formParams);
        if (auth != null) {
            spec.auth().preemptive().basic(auth.getUserName(), auth.getPassword());
        }

        Response response = spec
                .when()
                .body(requestBody)
                .put(url)
                .then()
                .extract()
                .response();

        logger.info(String.format(logTemplate, method.toString(), url));

        allureSteps.setMethod(requestSpec.getMethod());
        allureSteps.setUrl(requestSpec.getUrl());
        allureSteps.setRequestBody(requestSpec.getRequestBody());
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
        return response;
    }

    public Response delete(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        String url = requestSpec.getUrl();
        RequestMethodEnum method = requestSpec.getMethod();
        //headers
        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        //request body
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        //form params
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        //auth
        Auth auth = requestSpec.getAuth();
        //proxy
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        RequestSpecification spec = given()
                .config(config)
                .headers(headers)
                .formParams(formParams);
        if (auth != null) {
            spec.auth().preemptive().basic(auth.getUserName(), auth.getPassword());
        }

        Response response = spec
                .when()
                .body(requestBody)
                .delete(url)
                .then()
                .extract()
                .response();

        logger.info(String.format(logTemplate, method.toString(), url));

        allureSteps.setMethod(requestSpec.getMethod());
        allureSteps.setUrl(requestSpec.getUrl());
        allureSteps.setRequestBody(requestSpec.getRequestBody());
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
        return response;
    }

    public Response patch(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        String url = requestSpec.getUrl();
        RequestMethodEnum method = requestSpec.getMethod();
        //headers
        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        //request body
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        //form params
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        //auth
        Auth auth = requestSpec.getAuth();
        //proxy
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        RequestSpecification spec = given()
                .config(config)
                .headers(headers)
                .formParams(formParams);
        if (auth != null) {
            spec.auth().preemptive().basic(auth.getUserName(), auth.getPassword());
        }

        Response response = spec
                .when()
                .body(requestBody)
                .patch(url)
                .then()
                .extract()
                .response();

        logger.info(String.format(logTemplate, method.toString(), url));

        allureSteps.setMethod(requestSpec.getMethod());
        allureSteps.setUrl(requestSpec.getUrl());
        allureSteps.setRequestBody(requestSpec.getRequestBody());
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
        return response;
    }
}
