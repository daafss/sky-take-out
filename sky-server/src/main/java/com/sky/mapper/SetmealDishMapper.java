package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author: violet
 * Date: 2024/8/31 20:12
 */
@Mapper
public interface SetmealDishMapper {
    /**
     * 批量插入套餐口味
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
