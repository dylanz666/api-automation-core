package com.github.dylanz666.service.request;

import com.github.dylanz666.constant.RequestMethodEnum;
import com.github.dylanz666.domain.IRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class RequestFactory {
    @Autowired
    private Get get;
    @Autowired
    private Post post;
    @Autowired
    private Put put;
    @Autowired
    private Delete delete;
    @Autowired
    private Patch patch;

    public IRequest getRequest(RequestMethodEnum requestMethodEnum) {
        if (requestMethodEnum == RequestMethodEnum.GET) {
            return get;
        }
        if (requestMethodEnum == RequestMethodEnum.POST) {
            return post;
        }
        if (requestMethodEnum == RequestMethodEnum.PUT) {
            return put;
        }
        if (requestMethodEnum == RequestMethodEnum.DELETE) {
            return delete;
        }
        if (requestMethodEnum == RequestMethodEnum.PATCH) {
            return patch;
        }
        return null;
    }
}
