package com.suny.gulimall.member.dao;

import com.suny.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:44:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
