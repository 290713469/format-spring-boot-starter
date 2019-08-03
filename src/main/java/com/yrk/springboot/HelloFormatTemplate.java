package com.yrk.springboot;

import com.yrk.springboot.autoconfiguration.HelloProperties;
import com.yrk.springboot.format.FormatProcess;


public class HelloFormatTemplate {

    private FormatProcess formatProcess;
    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties, FormatProcess formatProcess) {
        this.helloProperties = helloProperties;
        this.formatProcess = formatProcess;
    }

    public <T> String doFormat(T object) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execute format : ").append("</br>");
        stringBuilder.append("HelloProperties: ").append(formatProcess.format(helloProperties.getInfo())).append("</br>");
        stringBuilder.append("Object format result : ").append(formatProcess.format(object)).append("</br>");
        return stringBuilder.toString();
    }
}
