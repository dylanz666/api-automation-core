package com.github.dylanz666.service;

import com.alibaba.fastjson.JSONObject;
import com.github.dylanz666.constant.AllureAttachmentTypeEnum;
import com.github.dylanz666.constant.MethodEnum;
import com.github.dylanz666.domain.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.preemptive;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class RequestServiceImpl implements IRequestService<RequestSpec> {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AllureStepsServiceImpl allureStepsService;
    @Autowired
    private AllureSteps allureSteps;
    @Autowired
    private ProxyServiceImpl proxyService;
    @Autowired
    private AllureAttachment allureAttachment;

    public Response get(RequestSpec requestSpec) {
        String url = requestSpec.getUrl();
        Map<String, String> formParams = requestSpec.getFormParams();
        JSONObject formData = requestSpec.getFormData();
        RequestSpecification spec = prepareRequestSpecification(requestSpec);

        Response response = given()
                .spec(spec)
                .get(url)
                .then()
                .extract()
                .response();
        handleAllureSteps(requestSpec, formParams, formData, response);
        return response;
    }

    public Response post(RequestSpec requestSpec) {
        String url = requestSpec.getUrl();
        Map<String, String> formParams = requestSpec.getFormParams();
        JSONObject formData = requestSpec.getFormData();
        RequestSpecification spec = prepareRequestSpecification(requestSpec);

        Response response = given()
                .spec(spec)
                .post(url)
                .then()
                .extract()
                .response();
        handleAllureSteps(requestSpec, formParams, formData, response);
        return response;
    }

    public Response put(RequestSpec requestSpec) {
        String url = requestSpec.getUrl();
        Map<String, String> formParams = requestSpec.getFormParams();
        JSONObject formData = requestSpec.getFormData();
        RequestSpecification spec = prepareRequestSpecification(requestSpec);

        Response response = given()
                .spec(spec)
                .put(url)
                .then()
                .extract()
                .response();
        handleAllureSteps(requestSpec, formParams, formData, response);
        return response;
    }

    public Response delete(RequestSpec requestSpec) {
        String url = requestSpec.getUrl();
        Map<String, String> formParams = requestSpec.getFormParams();
        JSONObject formData = requestSpec.getFormData();
        RequestSpecification spec = prepareRequestSpecification(requestSpec);

        Response response = given()
                .spec(spec)
                .delete(url)
                .then()
                .extract()
                .response();
        handleAllureSteps(requestSpec, formParams, formData, response);
        return response;
    }

    public Response patch(RequestSpec requestSpec) {
        String url = requestSpec.getUrl();
        Map<String, String> formParams = requestSpec.getFormParams();
        JSONObject formData = requestSpec.getFormData();
        RequestSpecification spec = prepareRequestSpecification(requestSpec);

        Response response = given()
                .spec(spec)
                .patch(url)
                .then()
                .extract()
                .response();
        handleAllureSteps(requestSpec, formParams, formData, response);
        return response;
    }

    private RequestSpecification prepareRequestSpecification(RequestSpec requestSpec) {
        RestAssuredConfig config = requestSpec.getConfig();
        Proxy proxy = requestSpec.getProxy();
        proxyService.setProxy(proxy);

        Map<String, String> headers = requestSpec.getHeaders();
        headers = headers == null ? new HashMap<>() : headers;
        headers.put("Accept", "application/json, text/plain, */*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "en-US,en;q=0.9");
        headers.put("Connection", "keep-alive");
        headers.put("Content-Type", "application/json");
        String requestBody = requestSpec.getRequestBody();
        requestBody = requestBody == null ? "" : requestBody;
        Map<String, String> formParams = requestSpec.getFormParams();
        formParams = formParams == null ? new HashMap<>() : formParams;
        if (formParams.size() > 0) {
            headers.put("Content-Type", "application/x-www-form-urlencoded");
        }
        JSONObject formData = requestSpec.getFormData();
        formData = formData == null ? new JSONObject() : formData;
        if (formData.size() > 0) {
            headers.put("Content-Type", "multipart/form-data");
        }

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setConfig(config);
        requestSpecBuilder.addHeaders(headers);
        requestSpecBuilder.addFormParams(formParams);
        requestSpecBuilder.setBody(requestBody);
        if (formData.size() > 0) {
            for (Map.Entry<String, Object> entry : formData.entrySet()) {
                requestSpecBuilder.addMultiPart(entry.getKey(), entry.getValue().toString());
            }
        }
        Auth auth = requestSpec.getAuth();
        if (auth != null) {
            requestSpecBuilder.setAuth(preemptive().basic(auth.getUserName(), auth.getPassword()));
        }
        Filter filter = requestSpec.getFilter();
        if (filter != null) {
            requestSpecBuilder.addFilter(filter);
        }
        List<Filter> filters = requestSpec.getFilters();
        if (filters != null && filters.size() > 0) {
            requestSpecBuilder.addFilters(filters);
        }
        return requestSpecBuilder.build();
    }

    private void handleAllureSteps(RequestSpec requestSpec, Map<String, String> formParams, JSONObject formData, Response response) {
        logger.info(String.format("[ %s ] %s", requestSpec.getMethod().toString(), requestSpec.getUrl()));

        List<AllureAttachment> info = new ArrayList<>();
        if (formParams != null && formParams.size() > 0) {
            allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
            allureAttachment.setName("FormParams");
            allureAttachment.setContent(formParams.toString());
            info.add(allureAttachment);
        }
        if (formData != null && formData.size() > 0) {
            allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
            allureAttachment.setName("FormData");
            allureAttachment.setContent(formData.toJSONString());
            info.add(allureAttachment);
        }
        allureSteps.setInfo(info);
        allureSteps.setMethod(requestSpec.getMethod());
        allureSteps.setUrl(requestSpec.getUrl());
        if (requestSpec.getMethod() != MethodEnum.GET) {
            allureSteps.setRequestBody(requestSpec.getRequestBody());
        }
        allureSteps.setResponse(response);
        allureStepsService.addSteps(allureSteps);
    }
}
