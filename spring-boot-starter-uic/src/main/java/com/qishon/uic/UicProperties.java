package com.qishon.uic;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by kenwstar on 2016/12/28.
 */
@ConfigurationProperties(prefix = "spring.uic")
@Data
public class UicProperties {
    /**
     * dubbo服务版本号,默认值为空
     */
    private String version = "";
    /**
     * rpc服务调用超时时间
     */
    private Integer timeout = 3000;
}
