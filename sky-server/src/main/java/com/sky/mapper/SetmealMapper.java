package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Author: violet
 * Date: 2024/8/29 14:14
 */
@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{id}")
    Integer countByCategoryId(Long id);
}
