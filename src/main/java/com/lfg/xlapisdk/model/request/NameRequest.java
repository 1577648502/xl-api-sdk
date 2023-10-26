package com.lfg.xlapisdk.model.request;

import com.lfg.xlapisdk.model.params.NameParams;
import com.lfg.xlapisdk.model.response.NameResponse;
import com.lfg.xlapisdk.model.enums.RequestMethodEnum;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoLiu
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
