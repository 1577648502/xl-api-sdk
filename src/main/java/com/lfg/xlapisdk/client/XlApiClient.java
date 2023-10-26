package com.lfg.xlapisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: XiaoLiu
 * @Date: 2023/09/15 08:41:51
 * @Version: 1.0
 * @Description: xl api客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class XlApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
