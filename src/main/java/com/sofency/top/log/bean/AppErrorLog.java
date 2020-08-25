package com.sofency.top.log.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaohufeng
 * @date: 错误的日志
 */
@Data
@Getter
@Setter
public class AppErrorLog {
    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情
}
