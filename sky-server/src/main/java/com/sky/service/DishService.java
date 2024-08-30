package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * Author: violet
 * Date: 2024/8/30 21:14
 */
public interface DishService {
    /**
     * 新增菜品
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
