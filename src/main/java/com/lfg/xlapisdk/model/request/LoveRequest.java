package com.lfg.xlapisdk.model.request;

import com.lfg.xlapisdk.model.response.LoveResponse;
import com.lfg.xlapisdk.model.response.NameResponse;
import com.lfg.xlapisdk.model.enums.RequestMethodEnum;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoLiu
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 随机情话
 */
@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

    @Override
    public String getPath() {
        return "/loveTalk";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<LoveResponse> getResponseClass() {
        return LoveResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
