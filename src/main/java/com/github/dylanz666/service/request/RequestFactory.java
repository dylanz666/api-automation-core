package com.github.dylanz666.service.request;

import com.github.dylanz666.constant.MethodEnum;
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

    public IRequest getRequest(MethodEnum requestMethodEnum) {
        if (requestMethodEnum == MethodEnum.GET) {
            return get;
        }
        if (requestMethodEnum == MethodEnum.POST) {
            return post;
        }
        if (requestMethodEnum == MethodEnum.PUT) {
            return put;
        }
        if (requestMethodEnum == MethodEnum.DELETE) {
            return delete;
        }
        if (requestMethodEnum == MethodEnum.PATCH) {
            return patch;
        }
        return null;
    }
}
