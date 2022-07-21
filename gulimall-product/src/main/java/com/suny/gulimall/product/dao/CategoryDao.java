package com.suny.gulimall.product.dao;

import com.suny.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 22:10:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
