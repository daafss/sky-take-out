package com.sky.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.sky.constant.StatusConstant;
import com.sky.context.BaseContext;
import com.sky.dto.CategoryDTO;
import com.sky.entity.Category;
import com.sky.mapper.CateGoryMapper;
import com.sky.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Author: violet
 * Date: 2024/8/29 14:13
 */
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CateGoryMapper cateGoryMapper;


    /**
     * 新增分类
     * @param categoryDTO
     */
    public void save(CategoryDTO categoryDTO) {
        Category category = BeanUtil.copyProperties(categoryDTO, Category.class);
        category.setCreateUser(BaseContext.getCurrentId());
        category.setUpdateUser(BaseContext.getCurrentId());
        category.setCreateTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        category.setStatus(StatusConstant.DISABLE);
        cateGoryMapper.insert(category);
    }
}
