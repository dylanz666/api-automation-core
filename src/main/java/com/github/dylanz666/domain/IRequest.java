package com.github.dylanz666.domain;

import io.restassured.response.Response;
import org.springframework.stereotype.Service;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public interface IRequest {
    Response launch(RequestSpec requestSpec);
}
