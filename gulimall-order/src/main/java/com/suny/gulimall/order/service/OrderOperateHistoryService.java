package com.suny.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:52:23
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

