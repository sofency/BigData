package com.sofency.top.log.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaohufeng
 * @date:  用户点赞
 */
@Data
@Getter
@Setter
public class AppPraise {
    private int id; //主键id
    private int userid;//用户id
    private int target_id;//点赞的对象id
    private int type;//点赞类型 1问答点赞 2问答评论点赞 3 文章点赞数4 评论点赞
    private String add_time;//添加时间
}
