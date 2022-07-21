package com.suny.gulimall.coupon.dao;

import com.suny.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:38:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
