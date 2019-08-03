package com.yrk.springboot.autoconfiguration;

import com.yrk.springboot.HelloFormatTemplate;
import com.yrk.springboot.format.FormatProcess;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties, FormatProcess formatProcess) {
        return new HelloFormatTemplate(helloProperties, formatProcess);
    }
}
