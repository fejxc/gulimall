package com.suny.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:44:49
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

