package com.lfg.xlapisdk.config;

import com.lfg.xlapisdk.client.XlApiClient;
import com.lfg.xlapisdk.service.impi.ApiServiceImpl;
import com.lfg.xlapisdk.service.ApiService;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: XiaoLiu
 * @Date: 2023年08月17日 21:09
 * @Version: 1.0
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties("qi.api.client")
@ComponentScan
public class XlApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public XlApiClient qiApiClient() {
        return new XlApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setXlApiClient(new XlApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
