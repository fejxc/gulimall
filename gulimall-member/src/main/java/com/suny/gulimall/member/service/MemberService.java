package com.suny.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suny.common.utils.PageUtils;
import com.suny.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 23:44:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

