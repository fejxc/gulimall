package com.suny.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:52:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

