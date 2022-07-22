package com.suny.gulimall.member.feign;

import com.suny.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:suny
 * @Date: 2022/7/22 11:56
 * @Description: 申明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping(value ="/coupon/coupon/member/list")
    public R memberCoupons();
}
