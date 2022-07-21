package com.suny.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:38:12
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

