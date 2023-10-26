package com.lfg.xlapisdk.utils;

import cn.hutool.crypto.digest.MD5;
import cn.hutool.json.JSONUtil;

/**
 * @Author: XiaoLiu
 * @Date: 2023年08月16日 12:22
 * @Version: 1.0
 * @Description: 返回md5加密后的参数
 */
public class SignUtils {
    public static String getSign(String body, String secretKey) {
        return MD5.create().digestHex(JSONUtil.toJsonStr(body) + '.' + secretKey);
    }
}
