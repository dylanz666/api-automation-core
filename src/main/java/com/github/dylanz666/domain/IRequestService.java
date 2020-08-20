package com.github.dylanz666.domain;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Component
public interface IRequestService<T> {
    Response get(T requestSpec);

    Response post(T requestSpec);

    Response put(T requestSpec);

    Response delete(T requestSpec);

    Response patch(T requestSpec);
}
