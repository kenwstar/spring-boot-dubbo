package com.qishon.uic;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import org.mvnsearch.spring.boot.dubbo.DubboBasedAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by kenwstar on 2016/12/28.
 */
public class UicDemoAutoconfiguration extends DubboBasedAutoConfiguration {
    @Autowired
    private UicProperties properties;

    @Bean
    public ReferenceBean<AccountManager> accountManager() {
        return getConsumerBean(AccountManager.class, properties.getVersion(), properties.getTimeout());
    }

}
