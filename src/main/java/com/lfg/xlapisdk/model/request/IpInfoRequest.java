package com.lfg.xlapisdk.model.request;

import com.lfg.xlapisdk.model.params.IpInfoParams;
import com.lfg.xlapisdk.model.response.NameResponse;
import com.lfg.xlapisdk.model.response.ResultResponse;
import com.lfg.xlapisdk.model.enums.RequestMethodEnum;
import lombok.experimental.Accessors;

/**
 * @Author: XiaoLiu
 * @Date: 2023/09/22 09:04:04
 * @Version: 1.0
 * @Description: 获取ip地址请求
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
