package com.suny.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.suny.common.validator.ListValue;
import com.suny.common.validator.group.AddGroup;
import com.suny.common.validator.group.UpdateGroup;
import com.suny.common.validator.group.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author suny
 * @email 1031364436@qq.com
 * @date 2022-07-21 22:10:21
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "更新修改不id能为空",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名必须提交",groups = {UpdateGroup.class,AddGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo必须是合法的地址",groups = {UpdateGroup.class,AddGroup.class})
    @NotBlank(groups = {AddGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(vals={0,1},groups={AddGroup.class, UpdateStatusGroup.class})
    @NotNull(groups={AddGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-z]$",message = "检索首字母必须是一个字母",groups = {UpdateGroup.class,AddGroup.class})
    @NotBlank(groups = {AddGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0, message = "排序必须大于等于0",groups = {UpdateGroup.class,AddGroup.class})
    @NotNull(groups = {AddGroup.class})
	private Integer sort;

}
