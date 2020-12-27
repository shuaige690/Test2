package com.zking.zzcloudspringbootstarter.sms;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class SmsServiceImpl implements ISmsService {

    private String accessKeyId;//访问ID、即帐号
    private String accessKeySecret;//访问凭证，即密码

    public SmsServiceImpl(String accessKeyId, String accessKeySecret) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    @Override
    public void send(String phone) {
//        System.out.println("接入短信系统，accessKeyId=" + accessKeyId + ",accessKeySecret=" + accessKeySecret);
//        System.out.println("短信发送，phone=" + phone + ",signName=" + signName + ",templateCode=" + templateCode + ",data=" + data);
        //接入短信接口
        String str=((Math.random()*9+1)*1000)+"";
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "zxl商城");
        request.putQueryParameter("TemplateCode", "SMS_205399315");
        request.putQueryParameter("TemplateParam", "{\"code\":"+str+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
