package com.yrk.springboot.format;

public interface FormatProcess {

    // 定义一个格式化的方法
    <T> String format(T object);
}
