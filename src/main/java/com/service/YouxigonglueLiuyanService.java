package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxigonglueLiuyanEntity;
import java.util.Map;

/**
 * 攻略留言 服务类
 * @author 
 * @since 2021-04-20
 */
public interface YouxigonglueLiuyanService extends IService<YouxigonglueLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}