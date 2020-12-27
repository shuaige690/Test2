package com.zking.zzcloudspringbootstarter.config;


import com.zking.zzcloudspringbootstarter.weblog.WebLogAspect;
import com.zking.zzcloudspringbootstarter.weblog.weblogProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({weblogProperties.class})
@ConditionalOnProperty(prefix = "zzcloud.weblog",value = "enabled", matchIfMissing = true)
public class weblogConfig {



    @Bean
    @ConditionalOnMissingBean
    public WebLogAspect webLogAspect(){
        return new WebLogAspect();
    }
}
