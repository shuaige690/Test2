package com.zking.zzcloudspringbootstarter.sms;

public interface ISmsService {

    /**
     * 发送短信
     *
     * @param phone        要发送的手机号
     */
    void send(String phone);
}
