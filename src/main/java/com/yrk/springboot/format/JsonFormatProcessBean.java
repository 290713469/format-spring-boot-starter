package com.yrk.springboot.format;


import com.alibaba.fastjson.JSON;

public class JsonFormatProcessBean implements FormatProcess {

    public <T> String format(T object) {
        return "JsonFormatProcess : " + JSON.toJSONString(object);
    }
}
