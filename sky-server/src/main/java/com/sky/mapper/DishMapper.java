package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Author: violet
 * Date: 2024/8/29 14:14
 */
@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param id
     * @return
     */
    @Select("select count(id) from dish where category_id = #{id}")
    Integer countByCategoryId(Long id);

    /**
     * 插入菜品数据
     * @param dish
     */
    @AutoFill(value = OperationType.INSERT)
    void insert(Dish dish);
}
