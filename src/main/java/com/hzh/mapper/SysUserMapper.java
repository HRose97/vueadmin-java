package com.hzh.mapper;

import com.hzh.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 我的公众号：MarkerHub
 * @since 2021-04-05
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

	List<Long> getNavMenuIds(Long userId);

	List<SysUser> listByMenuId(Long menuId);
}
