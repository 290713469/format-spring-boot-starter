package com.yrk.springboot.format;

public class StringFormatProcessBean implements FormatProcess {
    @Override
    public <T> String format(T object) {
        return "StringFormatProcess : " + object.toString();
    }
}
