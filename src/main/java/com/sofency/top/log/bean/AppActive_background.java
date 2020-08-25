package com.sofency.top.log.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author xiaohufeng
 * @date:　用户后台活跃
 */
@Data
@Getter
@Setter
public class AppActive_background {
    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade
}
