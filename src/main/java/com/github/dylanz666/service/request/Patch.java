package com.github.dylanz666.service.request;

import com.github.dylanz666.domain.IRequest;
import com.github.dylanz666.domain.RequestSpec;
import com.github.dylanz666.service.RequestServiceImpl;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class Patch implements IRequest {
    @Autowired
    private RequestServiceImpl requestService;

    @Override
    public Response launch(RequestSpec requestSpec) {
        return requestService.patch(requestSpec);
    }
}
