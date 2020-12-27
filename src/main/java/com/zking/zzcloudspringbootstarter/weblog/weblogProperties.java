package com.zking.zzcloudspringbootstarter.weblog;

/**
 * 属性类
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "zzcloud.weblog")
public class weblogProperties {

    private Boolean enabled; //是否启用 true为启用

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public weblogProperties() {
    }
}
