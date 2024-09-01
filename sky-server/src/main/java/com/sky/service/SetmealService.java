package com.sky.service;

import com.sky.dto.SetmealDTO;

/**
 * Author: violet
 * Date: 2024/9/1 19:37
 */
public interface SetmealService {
    /**
     * 新增套餐
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
