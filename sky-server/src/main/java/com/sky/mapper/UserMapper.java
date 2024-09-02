package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Author: violet
 * Date: 2024/9/2 14:14
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @param openId
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openId);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);
}
