package com.github.dylanz666.controller;

import com.github.dylanz666.domain.IRequest;
import com.github.dylanz666.domain.RequestSpec;
import com.github.dylanz666.service.request.RequestFactory;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Controller
public class RequestController {
    @Autowired
    private RequestFactory requestFactory;

    public Response launch(RequestSpec requestSpec) {
        IRequest iRequest = requestFactory.getRequest(requestSpec.getMethod());
        return iRequest.launch(requestSpec);
    }
}
