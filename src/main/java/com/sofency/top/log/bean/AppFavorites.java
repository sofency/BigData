package com.sofency.top.log.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaohufeng
 * @date:　　用户收藏
 */
@Data
@Getter
@Setter
public class AppFavorites {
    private int id;//主键
    private int course_id;//商品id
    private int userid;//用户ID
    private String add_time;//创建时间
}
