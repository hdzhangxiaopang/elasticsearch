package com.company.elastic.base.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {


    E1001(1001,"根据ID查询单条数据失败"),


    E0000(0000, "error message");

    private int code;
    private String message;
}