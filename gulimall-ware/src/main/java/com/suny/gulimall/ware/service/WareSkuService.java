package com.suny.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:54:53
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

