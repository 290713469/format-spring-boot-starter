package com.yrk.springboot.autoconfiguration;

import com.yrk.springboot.format.FormatProcess;
import com.yrk.springboot.format.JsonFormatProcessBean;
import com.yrk.springboot.format.StringFormatProcessBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatAutoConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcess stringFormat() {
        return new StringFormatProcessBean();
    }

    @Bean
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    public FormatProcess jsonFormat() {
        return new JsonFormatProcessBean();
    }

}
