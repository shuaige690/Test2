package com.zking.zzcloudspringbootstarter.sms;

/**
 * 属性类
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zzcloud.sms")
public class SmsProperties {

    private String accessKeyId;//访问ID、即帐号
    private String accessKeySecret;//访问凭证，即密码

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public SmsProperties() {
    }
}
