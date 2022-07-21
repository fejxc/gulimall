package com.suny.gulimall.order.dao;

import com.suny.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:52:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
