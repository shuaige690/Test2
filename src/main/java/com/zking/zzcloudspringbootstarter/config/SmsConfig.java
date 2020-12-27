package com.zking.zzcloudspringbootstarter.config;

import com.zking.zzcloudspringbootstarter.sms.SmsProperties;
import com.zking.zzcloudspringbootstarter.sms.SmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({SmsProperties.class})
public class SmsConfig {
    @Autowired
    private SmsProperties smsProperties;

    @Bean
    public SmsServiceImpl smsService(){
        return new SmsServiceImpl(smsProperties.getAccessKeyId(),smsProperties.getAccessKeySecret());
    }
}
