package com.github.dylanz666.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.dylanz666.constant.AllureAttachmentTypeEnum;
import com.github.dylanz666.domain.AllureAttachment;
import com.github.dylanz666.domain.AllureSteps;
import com.github.dylanz666.domain.IAllureStepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : dylanz
 * @since : 08/18/2020
 **/
@Service
public class AllureStepsServiceImpl implements IAllureStepsService<AllureSteps> {
    @Autowired
    private AllureAttachmentServiceImpl allureAttachmentService;

    @Override
    public Boolean addSteps(AllureSteps allureSteps) {
        try {
            if (allureSteps == null) {
                return false;
            }
            attachInfo(allureSteps);
            attachMethodAndUrl(allureSteps);
            attachRequest(allureSteps);
            attachResponse(allureSteps);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void attachInfo(AllureSteps allureSteps) {
        try {
            List<AllureAttachment> info = allureSteps.getInfo();
            if (info == null || info.size() == 0) {
                return;
            }
            for (AllureAttachment item : info) {
                AllureAttachment allureAttachment = new AllureAttachment();
                allureAttachment.setName(item.getName());
                allureAttachment.setType(item.getType());
                allureAttachment.setContent(item.getContent());
                allureAttachment.setFileExtension(item.getFileExtension());
                allureAttachmentService.addAttachment(allureAttachment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void attachMethodAndUrl(AllureSteps allureSteps) {
        try {
            String method = allureSteps.getMethod().toString();
            String url = allureSteps.getUrl();
            AllureAttachment allureAttachment = new AllureAttachment();
            allureAttachment.setName(method);
            allureAttachment.setContent(url);
            allureAttachmentService.addAttachment(allureAttachment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void attachRequest(AllureSteps allureSteps) {
        try {
            if (allureSteps.getRequestBody() == null || allureSteps.getRequestBody().equals("")) {
                return;
            }
            JSONObject bodyObject = JSONObject.parseObject(allureSteps.getRequestBody());
            String formattedBody = JSON.toJSONString(bodyObject, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
            AllureAttachment allureAttachment = new AllureAttachment();
            allureAttachment.setName("Request Body");
            allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
            allureAttachment.setContent(formattedBody);
            allureAttachmentService.addAttachment(allureAttachment);
        } catch (Exception e) {
            try {
                JSONArray bodyArray = JSONObject.parseArray(allureSteps.getRequestBody());
                String bodyString = JSON.toJSONString(bodyArray, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
                AllureAttachment allureAttachment = new AllureAttachment();
                allureAttachment.setName("Request Body");
                allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
                allureAttachment.setContent(bodyString);
                allureAttachmentService.addAttachment(allureAttachment);
            } catch (Exception exception) {
                AllureAttachment allureAttachment = new AllureAttachment();
                allureAttachment.setName("Request Body");
                allureAttachment.setType(AllureAttachmentTypeEnum.TEXT_PLAIN);
                allureAttachment.setContent(allureSteps.getRequestBody());
                allureAttachmentService.addAttachment(allureAttachment);
            }
        }
    }

    private void attachResponse(AllureSteps allureSteps) {
        try {
            JSONObject responseObject = JSONObject.parseObject(allureSteps.getResponse().asString());
            String responseString = JSON.toJSONString(responseObject, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
            AllureAttachment allureAttachment = new AllureAttachment();
            allureAttachment.setName("Response");
            allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
            allureAttachment.setContent(responseString);
            allureAttachmentService.addAttachment(allureAttachment);
        } catch (Exception e) {
            try {
                JSONArray responseArray = JSONObject.parseArray(allureSteps.getResponse().asString());
                String responseString = JSON.toJSONString(responseArray, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
                AllureAttachment allureAttachment = new AllureAttachment();
                allureAttachment.setName("Response");
                allureAttachment.setType(AllureAttachmentTypeEnum.APPLICATION_JSON);
                allureAttachment.setContent(responseString);
                allureAttachmentService.addAttachment(allureAttachment);
            } catch (Exception exception) {
                AllureAttachment allureAttachment = new AllureAttachment();
                allureAttachment.setName("Response");
                allureAttachment.setType(AllureAttachmentTypeEnum.TEXT_PLAIN);
                allureAttachment.setContent(allureSteps.getResponse().asString());
                allureAttachmentService.addAttachment(allureAttachment);
            }
        }
    }
}
