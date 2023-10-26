package com.lfg.xlapisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: XiaoLiu
 * @Date: 2023/09/22 10:11:04
 * @Version: 1.0
 * @Description: 获取快递信息请求参数
 */
@Data
@Accessors(chain = true)
public class QzoneVisitorParams implements Serializable {
    private static final long serialVersionUID = 3815182540434269670L;
    private String qq;
}
