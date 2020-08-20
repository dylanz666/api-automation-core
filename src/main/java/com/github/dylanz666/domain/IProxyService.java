package com.github.dylanz666.domain;

import org.springframework.stereotype.Component;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Component
public interface IProxyService<T> {
    void setProxy(T proxy);
}
