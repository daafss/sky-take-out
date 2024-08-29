package com.sky.service;

import com.sky.dto.CategoryDTO;

/**
 * Author: violet
 * Date: 2024/8/29 14:13
 */
public interface CategoryService {
    /**
     * 新增分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);
}
