package com.talk.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Description:
 *
 * @author Lynch Lee(lynchliwei@didiglobal.com)
 * @date 2019/12/8 19:11
 */
public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static  <T> T parse(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }



}
