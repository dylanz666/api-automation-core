package com.github.dylanz666.domain;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Component
public interface IRequest {
    Response launch(RequestSpec requestSpec);
}
