package com.atguigu.uitl;

import lombok.Data;

@Data
public class CommonResult {
    private boolean flag;
    private String msg;
    private Object objData;//保存返回的数据
}
